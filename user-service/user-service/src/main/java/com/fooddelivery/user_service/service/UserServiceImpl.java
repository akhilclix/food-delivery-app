package com.fooddelivery.user_service.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fooddelivery.user_service.model.User;
import com.fooddelivery.user_service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User register(User user) {
		return userRepository.save(user);
	}


	@Override
	public User login(String name, String password) {
		
		Optional<User> user = userRepository.findByName(name);
		
		if(user.isPresent()) {
			
			return user.get();
		}
		
		throw new RuntimeException("Invalid credentials");
		
	}
}
