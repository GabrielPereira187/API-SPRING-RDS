package com.example.dioclass.apirest.repositories;

import com.example.dioclass.apirest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
