package com.omkar.restaurantsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.omkar.restaurantsite.entity.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
}