package com.omkar.restaurantsite.controller;

import com.omkar.restaurantsite.entity.CartItem;
import com.omkar.restaurantsite.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CartController {

    @Autowired
    private CartItemRepository cartItemRepository;

    @PostMapping("/add-to-cart")
    public String addToCart(@RequestParam String dishName,
                            @RequestParam Double price) {

        List<CartItem> existingItems = cartItemRepository.findAll();

        for (CartItem item : existingItems) {
            if (item.getDishName().equals(dishName)) {
                item.setQuantity(item.getQuantity() + 1);
                cartItemRepository.save(item);
                return "redirect:/menu";
            }
        }

        CartItem item = new CartItem();
        item.setDishName(dishName);
        item.setPrice(price);
        item.setQuantity(1);
        item.setStatus("Pending");

        cartItemRepository.save(item);

        return "redirect:/menu";
    }

    @GetMapping("/cart")
    public String cart(Model model) {

        List<CartItem> cartItems = cartItemRepository.findAll();

        double total = 0;

        for (CartItem item : cartItems) {
            total += item.getPrice() * item.getQuantity();
        }

        model.addAttribute("cartItems", cartItems);
        model.addAttribute("totalAmount", total);

        return "cart";
    }

    @GetMapping("/remove-cart-item/{id}")
    public String removeCartItem(@PathVariable Long id) {
        cartItemRepository.deleteById(id);
        return "redirect:/cart";
    }

    @GetMapping("/order-success")
    public String orderSuccess() {

        List<CartItem> items = cartItemRepository.findAll();

        for (CartItem item : items) {
            if (item.getStatus().equals("Pending")) {
                item.setStatus("Preparing");
                cartItemRepository.save(item);
            }
        }

        return "order-success";
    }

    @GetMapping("/update-status/{id}/{status}")
    public String updateStatus(@PathVariable Long id,
                               @PathVariable String status) {

        CartItem item = cartItemRepository.findById(id).orElse(null);

        if (item != null) {
            item.setStatus(status);
            cartItemRepository.save(item);
        }

        return "redirect:/admin";
    }
    
    @GetMapping("/orders")
    public String orders(Model model) {

        model.addAttribute("orders", cartItemRepository.findAll());

        return "orders";
    }
}