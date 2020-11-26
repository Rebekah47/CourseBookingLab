package com.example.codeclan.CourseBookingLabTry2.controllers;

import com.example.codeclan.CourseBookingLabTry2.models.Booking;
import com.example.codeclan.CourseBookingLabTry2.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> findBookingsFilteredByGivenQuery(
            @RequestParam(name = "date", required = false) String date,
            @RequestParam(name = "name", required = false) String name){
        if (date != null){
            return new ResponseEntity(bookingRepository.findByDate(date), HttpStatus.OK);
        }
        if (name != null){
            return new ResponseEntity(bookingRepository.findCustomersByCourseName(name), HttpStatus.OK);
        }

        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }

}
