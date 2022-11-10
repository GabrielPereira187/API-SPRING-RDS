package com.example.dioclass.apirest.service;


import com.example.dioclass.apirest.model.Person;
import com.example.dioclass.apirest.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }

    public Person findById(Long id){
        return personRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person updatePerson (Person person , Long id){
        Person p = personRepository.getById(id);
        p.setName(person.getName());
        return personRepository.save(p);
    }
}
