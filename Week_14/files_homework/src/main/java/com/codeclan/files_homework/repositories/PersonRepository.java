package com.codeclan.files_homework.repositories;

import com.codeclan.files_homework.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
