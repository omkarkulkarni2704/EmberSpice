package com.omkar.restaurantsite.controller;

import com.omkar.restaurantsite.entity.TableBooking;
import com.omkar.restaurantsite.repository.TableBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {

    @Autowired
    private TableBookingRepository tableBookingRepository;

    @GetMapping("/booking")
    public String bookingPage() {
        return "booking";
    }

    @PostMapping("/booking")
    public String saveBooking(TableBooking tableBooking) {
        tableBookingRepository.save(tableBooking);
        return "redirect:/booking-success";
    }

    @GetMapping("/booking-success")
    public String bookingSuccess() {
        return "booking-success";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}