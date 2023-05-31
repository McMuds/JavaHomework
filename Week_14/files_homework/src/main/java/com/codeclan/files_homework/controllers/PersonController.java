package com.codeclan.files_homework.controllers;


import com.codeclan.files_homework.models.Person;
import com.codeclan.files_homework.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> getAllPeople(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity getPersonByID(@PathVariable Long id){
        Optional<Person> foundPerson = personRepository.findById(id);
        return new ResponseEntity(foundPerson, HttpStatus.OK);
    }

    @PostMapping(value = "/persons")
    public ResponseEntity postPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity(person, HttpStatus.CREATED);
    }
}
