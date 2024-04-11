package com.delta380.service;

import java.util.List;

import com.delta380.exception.UserException;
import com.delta380.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
