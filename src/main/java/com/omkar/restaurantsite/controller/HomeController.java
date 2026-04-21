package com.omkar.restaurantsite.controller;

import com.omkar.restaurantsite.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("reviews", reviewService.getAllReviews());

        return "index";
    }

    @PostMapping("/add-review")
    public String addReview(@RequestParam String customerName,
                            @RequestParam int rating,
                            @RequestParam String comment) {

        reviewService.saveReview(customerName, rating, comment);

        return "redirect:/";
    }
}