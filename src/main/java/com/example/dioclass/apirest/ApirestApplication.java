package com.example.dioclass.apirest;

import com.example.dioclass.apirest.model.Person;
import com.example.dioclass.apirest.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PersonRepository personRepository) {
		return args -> {
			personRepository.save(new Person("João"));
			personRepository.save(new Person("Maria"));
			personRepository.save(new Person("Ada"));
		};
	}

}
