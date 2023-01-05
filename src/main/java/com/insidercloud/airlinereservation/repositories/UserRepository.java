package com.insidercloud.airlinereservation.repositories;

import com.insidercloud.airlinereservation.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
