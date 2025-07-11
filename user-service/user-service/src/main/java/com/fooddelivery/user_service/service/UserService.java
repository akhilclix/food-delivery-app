package com.fooddelivery.user_service.service;

import com.fooddelivery.user_service.model.User;

public interface UserService {
	
	User register(User user);
	User login(String name, String password);

}
