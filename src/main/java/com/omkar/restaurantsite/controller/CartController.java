package com.omkar.restaurantsite.controller;

import com.omkar.restaurantsite.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add-to-cart")
    public String addToCart(@RequestParam String dishName,
                            @RequestParam Double price) {

        cartService.addToCart(dishName, price);

        return "redirect:/menu";
    }

    @GetMapping("/cart")
    public String cart(Model model) {

        model.addAttribute("cartItems", cartService.getAllCartItems());
        model.addAttribute("totalAmount", cartService.getTotalAmount());

        return "cart";
    }

    @GetMapping("/remove-cart-item/{id}")
    public String removeCartItem(@PathVariable Long id) {

        cartService.removeCartItem(id);

        return "redirect:/cart";
    }

    @GetMapping("/order-success")
    public String orderSuccess() {
        return "order-success";
    }

    @GetMapping("/orders")
    public String orders(Model model) {

        model.addAttribute("orders", cartService.getAllCartItems());

        return "orders";
    }

    @GetMapping("/update-status/{id}/{status}")
    public String updateStatus(@PathVariable Long id,
                               @PathVariable String status) {

        cartService.updateOrderStatus(id, status);

        return "redirect:/admin";
    }
}