package com.codeclan.courses_service.repositories;

import com.codeclan.courses_service.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
