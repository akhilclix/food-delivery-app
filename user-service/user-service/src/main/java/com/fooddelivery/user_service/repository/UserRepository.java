package com.fooddelivery.user_service.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fooddelivery.user_service.model.User;

public interface UserRepository extends MongoRepository<User,String>{

	Optional<User>findByName(String name);
}
