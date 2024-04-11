package com.delta380.service;

import com.delta380.exception.ProductException;
import com.delta380.modal.Cart;
import com.delta380.modal.CartItem;
import com.delta380.modal.User;
import com.delta380.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
