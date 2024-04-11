package com.delta380.service;

import java.util.List;

import com.delta380.exception.ProductException;
import com.delta380.modal.Rating;
import com.delta380.modal.User;
import com.delta380.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
