package com.insidercloud.airlinereservation.controller;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.springframework.data.domain.Sort;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.insidercloud.airlinereservation.models.ImportantNotes;
import com.insidercloud.airlinereservation.repositories.ImportantNotesRepository;

/**
 * Controller for requests to the {@code /profile} resource. Populates the model with the claims
 * from the {@linkplain OidcUser} for use by the view.
 */
@Controller
public class DashboardController {
    Logger logger = org.slf4j.LoggerFactory.getLogger(DashboardController.class);
    private final ImportantNotesRepository notes;

    public DashboardController(ImportantNotesRepository notes) {
        this.notes = notes;
    }

    @GetMapping("/dashboard")
    public String profile(Model model  /* , @AuthenticationPrincipal OidcUser oidcUser */) {
        model.addAttribute("title", "Dashboard");
        //model.addAttribute("profile", oidcUser.getClaims());

        if (notes.count()<1) {
            logger.info("No notes found");
            notes.saveAll(
                    List.of(
                            new ImportantNotes("This is a test note", "Test Note", "2021-05-01", "12:00:00"),
                            new ImportantNotes("This is a test note 2", "Test Note 2", "2021-04-01", "12:00:00"),
                            new ImportantNotes("This is a test note 3", "Test Note 3", "2021-03-01", "12:00:00"),
                            new ImportantNotes("This is a test note 4", "Test Note 4", "2021-02-01", "12:00:00"),
                            new ImportantNotes("This is a test note 5", "Test Note 5", "2021-01-01", "12:00:00")
                    )
            );
        } else {
            logger.info("{} Notes found", notes.count());
        }


        List<ImportantNotes> first5Notes;
        ArrayList<ImportantNotes> notesList = new ArrayList<>();
        
        if (notes.count() > 4) {
            first5Notes =
                    notes.findAll(Sort.by(Sort.Direction.DESC, "date")).subList(0,3);
        }
        else{
            first5Notes =
                    notes.findAll(Sort.by(Sort.Direction.DESC, "date"));
        }
        for (ImportantNotes note : first5Notes) {
            ImportantNotes ss=note.getClaims();
            notesList.add(ss);
        }
        model.addAttribute("noteList", notesList);
        model.addAttribute("stat1", "100");
        model.addAttribute("stat2", "200");
        model.addAttribute("stat3", "300");
        model.addAttribute("stat4", "400");
        model.addAttribute("active_tickets_count", 0);
        model.addAttribute("active_tickets", new ArrayList<>());


        return "dashboard_home";
    }

}
