package com.codeclan.files_homework.controllers;


import com.codeclan.files_homework.models.Person;
import com.codeclan.files_homework.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/persons")
    public List<Person> getAllPeople(){
        return personRepository.findAll();
    }
}
