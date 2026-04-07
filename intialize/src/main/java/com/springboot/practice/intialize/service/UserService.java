package com.springboot.practice.intialize.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private OrderService order;
	
	public UserService(OrderService order) {
		this.order = order;
	}
}
