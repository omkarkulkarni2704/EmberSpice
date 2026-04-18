package com.omkar.restaurantsite.repository;

import com.omkar.restaurantsite.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}