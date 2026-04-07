package com.springboot.practice.intialize.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	private UserService user;
	
	public OrderService (UserService user) {
		this.user = user;
	}
}
