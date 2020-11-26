package com.example.codeclan.CourseBookingLabTry2.repositories;


import com.example.codeclan.CourseBookingLabTry2.models.Course;
import com.example.codeclan.CourseBookingLabTry2.models.StarRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByStarRating(StarRating starRating);
    List<Course> findByBookingsCustomerName(String name);

}
