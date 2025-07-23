package com.fooddelivery.restaurant_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fooddelivery.restaurant_service.model.Restaurant;
import com.fooddelivery.restaurant_service.service.RestaurantService;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant) {
		
		return ResponseEntity.ok(restaurantService.addRestaurant(restaurant));
	}
}
