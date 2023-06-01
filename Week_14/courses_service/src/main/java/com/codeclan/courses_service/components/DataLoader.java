package com.codeclan.courses_service.components;

import com.codeclan.courses_service.models.Booking;
import com.codeclan.courses_service.models.Course;
import com.codeclan.courses_service.models.Customer;
import com.codeclan.courses_service.repositories.BookingRepository;
import com.codeclan.courses_service.repositories.CourseRepository;
import com.codeclan.courses_service.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Date;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        bookingRepository.deleteAll();
        customerRepository.deleteAll();
        courseRepository.deleteAll();
        Customer claire = new Customer("Claire", "Edinburgh", 50);
        Customer rodger = new Customer("Rodger", "Edinburgh", 30);
        Customer toby = new Customer("Toby", "Edinburgh", 26);
        Customer hannah = new Customer("Hannah", "Glasgow", 30);
        Customer max = new Customer("Max", "London", 40);
        Customer vanessa = new Customer("Vanessa", "London", 46);
        Customer simon = new Customer("Simon", "Glasgow", 52);
        customerRepository.save(claire);
        customerRepository.save(rodger);
        customerRepository.save(toby);
        customerRepository.save(hannah);
        customerRepository.save(max);
        customerRepository.save(vanessa);
        customerRepository.save(simon);
        Course java = new Course("Java","Edinburgh",4);
        Course python = new Course("Python","Edinburgh",3);
        Course spring = new Course("Spring","Edinburgh",5);
        Course javascript = new Course("JavaScript", "Glasgow", 2);
        Course flask = new Course("Flask", "London", 4);
        Course react = new Course("React","London", 5);
        courseRepository.save(java);
        courseRepository.save(python);
        courseRepository.save(spring);
        courseRepository.save(javascript);
        courseRepository.save(flask);
        courseRepository.save(react);
        Date date1 = new Date(123, 6, 01);
        Date date2 = new Date(123, 7, 01);
        Date date3 = new Date(123, 8, 01);
        Booking booking1 = new Booking(date1, react, rodger);
        Booking booking2 = new Booking(date1, react, claire);
        Booking booking3 = new Booking(date2, javascript, claire);
        Booking booking4 = new Booking(date2, flask, toby);
        Booking booking5 = new Booking(date1, python, toby);
        Booking booking6 = new Booking(date3, python, claire);
        Booking booking7 = new Booking(date2, flask, hannah);
        Booking booking8 = new Booking(date3, spring, vanessa);
        Booking booking9 = new Booking(date2, spring, rodger);
        Booking booking10 = new Booking(date2, python, max);
        Booking booking11 = new Booking(date1, javascript, max);
        Booking booking12 = new Booking(date1, python, simon);
        Booking booking13 = new Booking(date2, flask, simon);
        Booking booking14 = new Booking(date3, javascript, simon);
        Booking booking15 = new Booking(date2, javascript, claire);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);
        bookingRepository.save(booking5);
        bookingRepository.save(booking6);
        bookingRepository.save(booking7);
        bookingRepository.save(booking8);
        bookingRepository.save(booking9);
        bookingRepository.save(booking10);
        bookingRepository.save(booking11);
        bookingRepository.save(booking12);
        bookingRepository.save(booking13);
        bookingRepository.save(booking14);
        bookingRepository.save(booking15);
    }
}
