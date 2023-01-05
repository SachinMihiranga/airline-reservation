package com.insidercloud.airlinereservation.repositories;

import com.insidercloud.airlinereservation.models.Plane;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaneRepository extends MongoRepository<Plane,String> {
}
