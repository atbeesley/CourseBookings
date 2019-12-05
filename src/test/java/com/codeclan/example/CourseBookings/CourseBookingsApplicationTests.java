package com.codeclan.example.CourseBookings;

import com.codeclan.example.CourseBookings.models.Booking;
import com.codeclan.example.CourseBookings.models.Course;
import com.codeclan.example.CourseBookings.models.Customer;
import com.codeclan.example.CourseBookings.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBookings.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBookings.repositories.CustomerRepository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseBookingsApplicationTests {

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
	public void canFindCourseByRating(){
		List<Course> foundCourses = courseRepository.getAllCoursesByStarRating(5);
		assertEquals(1, foundCourses.size());
	}

	@Test
	public void canGetCustomersByBooking(){
		List<Customer> foundCustomers = customerRepository.getAllCustomersByBookingsCourseName("Introduction to Egyptian Hieroglyphics");
		assertEquals(1, foundCustomers.size());
	}

	@Test
	public void canGetCoursesByCustomer(){
		List<Course> foundCourses = courseRepository.getAllCoursesByBookingsCustomerNameIgnoreCase("Howard Carter");
		assertEquals(1, foundCourses.size());
	}

	@Test
	public void canGetBookingsForDate(){
		List<Booking> foundBookings = bookingRepository.getAllBookingsByDate("13-01-2020");
		assertEquals(1, foundBookings.size());
	}

}
