package com.fooddelivery.restaurant_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collation =  "restaurants")
public class Restaurant {
	
	@Id
	private String id;
	private String name;
	private String address;
	private String cuisine;

}
