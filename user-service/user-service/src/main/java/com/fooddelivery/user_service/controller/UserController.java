package com.fooddelivery.user_service.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fooddelivery.user_service.model.LoginRequest;
import com.fooddelivery.user_service.model.User;
import com.fooddelivery.user_service.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.register(user);
    }
    
    @GetMapping
    public List<User> getAllUsers(){
    	return userService.getAllUsers();
    }
    
    @PostMapping("/login")
    public User login(@RequestBody LoginRequest loginRequest) {
    	
    	return userService.login(loginRequest.getName(),loginRequest.getPassword());
    }
}
