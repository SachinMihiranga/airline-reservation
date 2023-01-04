package com.insidercloud.airlinereservation.controller;

import com.insidercloud.airlinereservation.models.Plane;
import com.insidercloud.airlinereservation.repositories.PlaneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/api")
public class PlaneController {

    private final static Logger LOGGER = LoggerFactory.getLogger(PlaneController.class);
    private final PlaneRepository planeRepository;

    public PlaneController(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    @PostMapping("plane")
    @ResponseStatus(HttpStatus.CREATED)
    public Plane postPlane(@RequestBody Plane plane) {
        return planeRepository.save(plane);
    }

    @PostMapping("planes")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Plane> postPlanes(@RequestBody List<Plane> planes) {
        return planeRepository.saveAll(planes);
    }

    @GetMapping("planes")
    public List<Plane> getPlanes() {
        return planeRepository.findAll();
    }

    @GetMapping("plane/{id}")
    public ResponseEntity<Plane> getPlane(@PathVariable String id) {
        Optional<Plane> plane = planeRepository.findById(id);
        if (plane.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(plane.get());
    }

    @GetMapping("planes/{ids}")
    public List<Plane> getPlanes(@PathVariable String ids) {
        List<String> listIds = asList(ids.split(","));
        return planeRepository.findAll(listIds);
    }

    @GetMapping("planes/count")
    public Long getCount() {
        return planeRepository.count();
    }

    @DeleteMapping("plane/{id}")
    public Long deletePlane(@PathVariable String id) {
        return planeRepository.delete(id);
    }


    @DeleteMapping("planes/{ids}")
    public Long deletePlanes(@PathVariable String ids) {
        List<String> listIds = asList(ids.split(","));
        return planeRepository.delete(listIds);
    }


    @PutMapping("plane")
    public Plane putPlane(@RequestBody Plane plane) {
        return planeRepository.update(plane);
    }

    @PutMapping("planes")
    public Long putPlane(@RequestBody List<Plane> planes) {
        return planeRepository.update(planes);
    }




}
