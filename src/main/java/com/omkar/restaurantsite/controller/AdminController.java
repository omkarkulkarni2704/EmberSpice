package com.omkar.restaurantsite.controller;

import com.omkar.restaurantsite.entity.CartItem;
import com.omkar.restaurantsite.repository.CartItemRepository;
import com.omkar.restaurantsite.repository.TableBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private TableBookingRepository tableBookingRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @GetMapping("/admin")
    public String admin(Model model) {

        List<CartItem> orders = cartItemRepository.findAll();

        double totalRevenue = 0;

        for (CartItem item : orders) {
            totalRevenue += item.getPrice() * item.getQuantity();
        }

        model.addAttribute("bookings", tableBookingRepository.findAll());
        model.addAttribute("orders", orders);
        model.addAttribute("totalRevenue", totalRevenue);

        return "admin";
    }
}