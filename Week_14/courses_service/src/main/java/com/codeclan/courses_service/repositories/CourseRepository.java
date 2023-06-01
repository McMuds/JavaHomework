package com.codeclan.courses_service.repositories;

import com.codeclan.courses_service.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByRating (Integer rating);
    List<Course> findByBookingsCustomerId (Long id);
}
