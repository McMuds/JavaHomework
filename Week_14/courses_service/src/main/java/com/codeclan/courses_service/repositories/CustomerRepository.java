package com.codeclan.courses_service.repositories;


import com.codeclan.courses_service.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
