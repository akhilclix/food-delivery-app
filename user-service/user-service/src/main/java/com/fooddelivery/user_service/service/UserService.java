package com.fooddelivery.user_service.service;

import java.util.List;

import com.fooddelivery.user_service.model.User;

public interface UserService {
	
	User register(User user);
	List<User> getAllUsers();
	User login(String name, String password);

}
