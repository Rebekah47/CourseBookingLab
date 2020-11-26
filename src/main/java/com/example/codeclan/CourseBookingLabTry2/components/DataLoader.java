package com.example.codeclan.CourseBookingLabTry2.components;

import com.example.codeclan.CourseBookingLabTry2.models.Booking;
import com.example.codeclan.CourseBookingLabTry2.models.Course;
import com.example.codeclan.CourseBookingLabTry2.models.Customer;
import com.example.codeclan.CourseBookingLabTry2.models.StarRating;
import com.example.codeclan.CourseBookingLabTry2.repositories.BookingRepository;
import com.example.codeclan.CourseBookingLabTry2.repositories.CourseRepository;
import com.example.codeclan.CourseBookingLabTry2.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){

        Customer customer1 = new Customer("John", "Glasgow", 23);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Sue", "Edinburgh", 45);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Bob", "Dundee", 30);
        customerRepository.save(customer3);

        Course course1 = new Course("PSD", "Glasgow", StarRating.FIVE);
        courseRepository.save(course1);
        Course course2 = new Course("Data Analysis", "Dundee", StarRating.TWO);
        courseRepository.save(course2);
        Course course3 = new Course("UX", "Edinburgh", StarRating.ONE);
        courseRepository.save(course3);


        Booking booking1 = new Booking("12-03-20", customer1, course1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("12-03-20", customer2, course2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("12-03-20", customer3, course3);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("12-03-20",  customer1, course3);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("12-03-20",  customer2, course3);
        bookingRepository.save(booking5);


    }
}
