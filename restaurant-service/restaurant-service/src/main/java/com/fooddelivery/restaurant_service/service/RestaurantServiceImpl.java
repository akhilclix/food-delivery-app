package com.fooddelivery.restaurant_service.service;

import org.springframework.stereotype.Service;

import com.fooddelivery.restaurant_service.model.Restaurant;
import com.fooddelivery.restaurant_service.repository.RestaurantRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // can avoid the writing of constructor
public class RestaurantServiceImpl implements RestaurantService {
	
	private final RestaurantRepository restaurantRepository;
	

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		
		return restaurantRepository.save(restaurant);
		
	}

}
