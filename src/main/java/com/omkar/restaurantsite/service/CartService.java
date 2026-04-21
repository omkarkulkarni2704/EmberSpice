package com.omkar.restaurantsite.service;

import com.omkar.restaurantsite.entity.CartItem;
import com.omkar.restaurantsite.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public void addToCart(String dishName, Double price) {

        List<CartItem> items = cartItemRepository.findAll();

        for (CartItem item : items) {

            if (item.getDishName().equalsIgnoreCase(dishName)) {

                item.setQuantity(item.getQuantity() + 1);

                cartItemRepository.save(item);

                return;
            }
        }

        CartItem newItem = new CartItem();
        newItem.setDishName(dishName);
        newItem.setPrice(price);
        newItem.setQuantity(1);
        newItem.setStatus("Pending");

        cartItemRepository.save(newItem);
    }

    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    public double getTotalAmount() {

        double total = 0;

        for (CartItem item : cartItemRepository.findAll()) {
            total += item.getPrice() * item.getQuantity();
        }

        return total;
    }

    public void removeCartItem(Long id) {
        cartItemRepository.deleteById(id);
    }

    public void updateOrderStatus(Long id, String status) {

        CartItem item = cartItemRepository.findById(id).orElse(null);

        if (item != null) {
            item.setStatus(status);
            cartItemRepository.save(item);
        }
    }
}