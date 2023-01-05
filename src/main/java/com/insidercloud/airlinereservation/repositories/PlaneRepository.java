package com.insidercloud.airlinereservation.repositories;

import com.insidercloud.airlinereservation.models.Plane;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlaneRepository extends MongoRepository<Plane,String> {
    Plane update(Plane plane);

    Long update(List<Plane> planes);

    Long delete(List<String> listIds);

    List<Plane> findAll(List<String> listIds);

    Long delete(String id);
}
