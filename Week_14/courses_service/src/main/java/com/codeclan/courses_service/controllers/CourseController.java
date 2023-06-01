package com.codeclan.courses_service.controllers;

import com.codeclan.courses_service.models.Course;
import com.codeclan.courses_service.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses(
            @RequestParam (name="rating", required = false) Integer rating,
            @RequestParam (name= "customer", required = false) Long custId){
        if (rating != null){
            return new ResponseEntity<>(courseRepository.findByRating(rating), HttpStatus.OK);
        } else if (custId != null) {
            return new ResponseEntity<>(courseRepository.findByBookingsCustomerId(custId), HttpStatus.OK);
        }
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/courses/{id}")
    public ResponseEntity getCourseById(@PathVariable Long id){
        return new ResponseEntity(courseRepository.findById(id), HttpStatus.OK);
    }
}
