package com.fooddelivery.service;

import com.fooddelivery.model.User;

public interface UserService {
	
	User register();
	User login(String username, String password);

}
