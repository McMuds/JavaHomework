package com.codeclan.courses_service;

import com.codeclan.courses_service.models.Booking;
import com.codeclan.courses_service.models.Course;
import com.codeclan.courses_service.models.Customer;
import com.codeclan.courses_service.repositories.BookingRepository;
import com.codeclan.courses_service.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.codeclan.courses_service.repositories.CourseRepository;

import java.util.Date;

@SpringBootTest
class CoursesServiceApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveItems(){
		courseRepository.deleteAll();
		customerRepository.deleteAll();
		bookingRepository.deleteAll();
		Course course = new Course("Intro To JavaScript", "Edinburgh", 4);
		courseRepository.save(course);
		Customer customer = new Customer("Claire McMurdo", "Edinburgh", 29);
		customerRepository.save(customer);
		Booking booking = new Booking(new Date(2023, 15, 06));
		bookingRepository.save(booking);
	}
}
