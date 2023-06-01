package com.codeclan.courses_service.repositories;


import com.codeclan.courses_service.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByBookingsCourseId (Long courseId);
}
