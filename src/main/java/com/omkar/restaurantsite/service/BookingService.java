package com.omkar.restaurantsite.service;

import com.omkar.restaurantsite.entity.TableBooking;
import com.omkar.restaurantsite.repository.TableBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private TableBookingRepository tableBookingRepository;

    public void saveBooking(TableBooking booking) {
        tableBookingRepository.save(booking);
    }
}