package com.fooddelivery.user_service.model;

import lombok.Data;

@Data
public class LoginRequest {

	private String name;
	private String password;
}
