package com.example.codeclan.CourseBookingLabTry2.controllers;


import com.example.codeclan.CourseBookingLabTry2.models.Course;
import com.example.codeclan.CourseBookingLabTry2.models.StarRating;
import com.example.codeclan.CourseBookingLabTry2.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCoursesFilteredByGivenQuery(
            @RequestParam(name = "input", required = false)Integer input,
            @RequestParam(name = "name", required = false) String name){
        if(input != null){
            for (StarRating i : StarRating.values() ){
                if (input.equals(i.getValue())){
                    return new ResponseEntity(courseRepository.findByStarRating(i), HttpStatus.OK);
                }
            }
        }
        if(name != null){
            return new ResponseEntity<>(courseRepository.findByBookingsCustomerName(name), HttpStatus.OK);
        }
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }
}
