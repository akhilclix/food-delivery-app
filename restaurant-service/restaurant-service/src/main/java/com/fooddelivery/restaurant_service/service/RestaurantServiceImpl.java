package com.fooddelivery.restaurant_service.service;

import com.fooddelivery.restaurant_service.model.Restaurant;
import com.fooddelivery.restaurant_service.repository.RestaurantRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // can avoid the writing of constructor
public class RestaurantServiceImpl implements RestaurantService {
	
	private final RestaurantRepository restaurantRepository;
	

	@Override
	public void addRestaurant(Restaurant restaurant) {
		
		restaurantRepository.save(restaurant);
		
	}

}
