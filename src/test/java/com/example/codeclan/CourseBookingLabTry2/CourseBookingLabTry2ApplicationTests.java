package com.example.codeclan.CourseBookingLabTry2;

import com.example.codeclan.CourseBookingLabTry2.models.Booking;
import com.example.codeclan.CourseBookingLabTry2.models.Course;
import com.example.codeclan.CourseBookingLabTry2.models.StarRating;
import com.example.codeclan.CourseBookingLabTry2.repositories.BookingRepository;
import com.example.codeclan.CourseBookingLabTry2.repositories.CourseRepository;
import com.example.codeclan.CourseBookingLabTry2.repositories.CustomerRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class CourseBookingLabTry2ApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetCustomersByCourseName(){
		List<Booking> bookingsFound = bookingRepository.findCustomersByCourseNameIgnoreCase("UX");
		assertEquals(3, bookingsFound.size());
	}

	@Test
	public void canGetCoursesWithStarRatingFive(){
		List<Course> found = courseRepository.findByStarRating(StarRating.FIVE);
		assertEquals(1, found.size());
	}

	@Test
	public void canGetBookingsForAGivenDate(){
		List<Booking> found = bookingRepository.findByDate("12-03-20");
		assertEquals(5, found.size());
	}

	@Test
	public void canGetCourseByCustomerName(){
		List<Course> found = courseRepository.findByBookingsCustomerNameIgnoreCase("John");
		assertEquals(2, found.size());
	}


}
