package com.codeclan.example.CourseBookings.components;

import com.codeclan.example.CourseBookings.models.Booking;
import com.codeclan.example.CourseBookings.models.Course;
import com.codeclan.example.CourseBookings.models.Customer;
import com.codeclan.example.CourseBookings.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBookings.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBookings.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {



    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Course course1 = new Course("Introduction to Egyptian Hieroglyphics", "Alexandria", 4);
        courseRepository.save(course1);

        Customer customer1 = new Customer("Howard Carter", "Kensington", 28);
        customerRepository.save(customer1);

        Booking booking1 = new Booking("13-01-2020", course1, customer1);
        bookingRepository.save(booking1);

        Course course2 = new Course("Advanced Aztec Architecture", "Tenochtitlan", 5);
        courseRepository.save(course1);

        Customer customer2 = new Customer("Hernan Cortes", "Badajoz", 32);
        customerRepository.save(customer1);

        Booking booking2 = new Booking("25-12-2023", course2, customer2);
        bookingRepository.save(booking1);

        course1.addBooking(booking1);
        courseRepository.save(course1);

        course2.addBooking(booking2);
        courseRepository.save(course2);

    }

}
