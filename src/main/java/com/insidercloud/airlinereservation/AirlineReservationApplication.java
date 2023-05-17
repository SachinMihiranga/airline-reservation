package com.insidercloud.airlinereservation;

import com.insidercloud.airlinereservation.models.Plane;
import com.insidercloud.airlinereservation.models.User;
import com.insidercloud.airlinereservation.repositories.PlaneRepository;
import com.insidercloud.airlinereservation.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class AirlineReservationApplication implements CommandLineRunner {

	private final UserRepository userRepository;
	private final PlaneRepository planeRepository;
	private final Logger log = LoggerFactory.getLogger(AirlineReservationApplication.class.getName());

	public AirlineReservationApplication(UserRepository userRepository, PlaneRepository planeRepository) {
		this.userRepository = userRepository;
		this.planeRepository = planeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AirlineReservationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<User> users = userRepository.findAll();
		if (users.isEmpty()) {
			userRepository.save(new User("John", "Doe", "doe@air.com"));
		}
		for (User user : users) {
			log.info(user.toString());
		}

		for (Plane plane : planeRepository.findAll()) {
			log.info(plane.toString());
		}
		log.info("{} users found", userRepository.count());
		log.info("{} planes found", planeRepository.count());

		log.info("Application started");
	}
}
