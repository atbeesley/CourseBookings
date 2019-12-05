package com.codeclan.example.CourseBookings.repositories.CourseRepository;


import com.codeclan.example.CourseBookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long>, CustomisedCourseRepository {

    List<Course> getAllCoursesByStarRating(int starRating);
    List<Course> getAllCoursesByBookingsCustomerNameIgnoreCase(String name);
}
