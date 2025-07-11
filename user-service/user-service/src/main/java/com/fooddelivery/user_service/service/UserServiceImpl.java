package com.fooddelivery.user_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fooddelivery.user_service.model.LoginRequest;
import com.fooddelivery.user_service.model.User;
import com.fooddelivery.user_service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User register(User user) {
		return userRepository.save(user);
	}

	@Override
	public User login(String name,String password) {

		Optional<User> userOpt = userRepository.findByName(name);
		if (userOpt.isEmpty()) {
			throw new RuntimeException("User not found");
		}

		User user = userOpt.get();

		if (!user.getPassword().equals(password)) {
			throw new RuntimeException("Invalid password");
		}

		return user;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
