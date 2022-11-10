package com.example.dioclass.apirest.controller;

import com.example.dioclass.apirest.model.Person;
import com.example.dioclass.apirest.repositories.PersonRepository;
import com.example.dioclass.apirest.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1")
public class PersonController {
    private final PersonService personService;


    @GetMapping(value = "/personById/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id){
        return ResponseEntity.ok(personService.findById(id));
    }

    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> findAllPersons(){
        return ResponseEntity.ok(personService.findAll());
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Person> save(@RequestBody Person person){
        return ResponseEntity.ok(personService.save(person));
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Person> update(@RequestBody Person person, @PathVariable Long id){
        return ResponseEntity.ok(personService.updatePerson(person,id));
    }



}
