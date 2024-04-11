package com.delta380.service;

import java.util.List;

import com.delta380.exception.ProductException;
import com.delta380.modal.Review;
import com.delta380.modal.User;
import com.delta380.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
