package com.codeclan.example.CourseBookings.controllers;


import com.codeclan.example.CourseBookings.models.Booking;
import com.codeclan.example.CourseBookings.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value= "/{date}")
    public List<Booking> getAllBookingsByDate(String date){
        return getAllBookingsByDate(date);
    }

}
