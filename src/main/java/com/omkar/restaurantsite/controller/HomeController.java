package com.omkar.restaurantsite.controller;

import com.omkar.restaurantsite.entity.Review;
import com.omkar.restaurantsite.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("reviews", reviewRepository.findAll());

        return "index";
    }
    
    @PostMapping("/add-review")
    public String addReview(@RequestParam String customerName,
                            @RequestParam int rating,
                            @RequestParam String comment) {

        Review review = new Review();
        review.setCustomerName(customerName);
        review.setRating(rating);
        review.setComment(comment);

        reviewRepository.save(review);

        return "redirect:/";
    }
}