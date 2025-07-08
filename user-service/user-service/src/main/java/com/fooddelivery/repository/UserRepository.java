package com.fooddelivery.repository;


import com.fooddelivery.model.User;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{

	Optional<User>findByUserName(String username);
}
