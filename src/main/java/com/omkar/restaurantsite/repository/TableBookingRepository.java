package com.omkar.restaurantsite.repository;

import com.omkar.restaurantsite.entity.TableBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableBookingRepository extends JpaRepository<TableBooking, Long> {
}