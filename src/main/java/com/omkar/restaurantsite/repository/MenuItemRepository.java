package com.omkar.restaurantsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.omkar.restaurantsite.entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}