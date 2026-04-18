package com.omkar.restaurantsite.repository;

import com.omkar.restaurantsite.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}