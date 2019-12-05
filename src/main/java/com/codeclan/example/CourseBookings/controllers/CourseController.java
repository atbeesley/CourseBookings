package com.codeclan.example.CourseBookings.controllers;


import com.codeclan.example.CourseBookings.models.Booking;
import com.codeclan.example.CourseBookings.models.Course;
import com.codeclan.example.CourseBookings.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBookings.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value= "/rating/{rating}")
    public List<Course> getAllCoursesByStarRating(@PathVariable int rating){
        return courseRepository.getAllCoursesByStarRating(rating);
    }

    @GetMapping(value = "/{booking}/{name}")
    public List<Course> getAllCoursesByBookingsCustomerNameIgnoreCase(@PathVariable String name){
        return courseRepository.getAllCoursesByBookingsCustomerNameIgnoreCase(name);
    }




}
