package com.omkar.restaurantsite.controller;

import com.omkar.restaurantsite.entity.TableBooking;
import com.omkar.restaurantsite.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/booking")
    public String bookingPage() {
        return "booking";
    }

    @PostMapping("/booking")
    public String saveBooking(TableBooking booking) {

        bookingService.saveBooking(booking);

        return "booking-success";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}