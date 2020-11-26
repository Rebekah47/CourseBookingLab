package com.example.codeclan.CourseBookingLabTry2.repositories;


import com.example.codeclan.CourseBookingLabTry2.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
