package com.omkar.restaurantsite.service;

import com.omkar.restaurantsite.entity.Review;
import com.omkar.restaurantsite.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public void saveReview(String customerName, int rating, String comment) {

        Review review = new Review();
        review.setCustomerName(customerName);
        review.setRating(rating);
        review.setComment(comment);

        reviewRepository.save(review);
    }
}