package com.codeclan.example.CourseBookings.controllers;


import com.codeclan.example.CourseBookings.models.Customer;
import com.codeclan.example.CourseBookings.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/{booking}/{date}")
    public List<Customer> getAllCustomersByBookingsCourseName(String name){
        return customerRepository.getAllCustomersByBookingsCourseName(name);
    }

}
