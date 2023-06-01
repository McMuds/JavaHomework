package com.codeclan.courses_service.repositories;

import com.codeclan.courses_service.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
