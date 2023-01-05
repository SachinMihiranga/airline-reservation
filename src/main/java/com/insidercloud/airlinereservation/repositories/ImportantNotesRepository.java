package com.insidercloud.airlinereservation.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.insidercloud.airlinereservation.models.ImportantNotes;

public interface ImportantNotesRepository extends MongoRepository<ImportantNotes,String> {

    /// get the last 5 notes
    public ImportantNotes findTop5ByOrderByDateDesc();

}