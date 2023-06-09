package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> getAllWhiskiesFilterByThings(
            @RequestParam(name="year", required = false) Integer year,
            @RequestParam(name="age", required = false) Integer age,
            @RequestParam(name = "distillery", required = false) String distillery){
        if (year != null){
            return new ResponseEntity<>(whiskyRepository.findByYear(year), HttpStatus.OK);
        } else {
            if (age != null && distillery != null){
                return new ResponseEntity<>(whiskyRepository.findByAgeAndDistilleryName(
                        age, distillery), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/distillery")
    public ResponseEntity<List<Whisky>> getAllTheWhiskiesForADistillery(
            @RequestParam(name="named", required = false) String distillery,
            @RequestParam(name="location", required = false) String location){
        if (distillery != null){
           return new ResponseEntity<>(whiskyRepository.findByDistilleryName(distillery),
                   HttpStatus.OK);
        } else if (location != null) {
            return new ResponseEntity<>(whiskyRepository.findByDistilleryRegion(location),
                    HttpStatus.OK);
        }
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

}
