package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findByYear (Integer year);
    List<Whisky> findByAgeAndDistilleryName (Integer age, String name);
    List<Whisky> findByDistilleryName (String name);
    List<Whisky> findByDistilleryRegion(String location);
}
