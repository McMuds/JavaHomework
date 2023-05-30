package com.codeclan.files_homework.components;

import com.codeclan.files_homework.models.Person;
import com.codeclan.files_homework.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
//@Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner{
    @Autowired
    PersonRepository personRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Person claire = new Person("Claire");
        personRepository.save(claire);
        Person toby = new Person("Toby");
        personRepository.save(toby);
        Person jasper = new Person("Jasper");
        personRepository.save(jasper);
        Person andrew = new Person("Andrew");
        personRepository.save(andrew);
        Person keith = new Person("Keith");
        personRepository.save(keith);
        Person mar = new Person("Mar");
        personRepository.save(mar);
    }






}
