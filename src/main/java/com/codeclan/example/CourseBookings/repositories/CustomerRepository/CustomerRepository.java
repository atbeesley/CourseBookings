package com.codeclan.example.CourseBookings.repositories.CustomerRepository;


import com.codeclan.example.CourseBookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> getAllCustomersByBookingsCourseName(String name);
}
