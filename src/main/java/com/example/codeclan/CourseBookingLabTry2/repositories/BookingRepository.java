package com.example.codeclan.CourseBookingLabTry2.repositories;


import com.example.codeclan.CourseBookingLabTry2.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findCustomersByCourseNameIgnoreCase(String name);
    List<Booking> findByDate(String date);

}
