package com.springboot.practice.intialize.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private OrderService order;
	
//	public UserService(@Lazy OrderService order) {
//		this.order = order;
//	}
	
	@Autowired
	public void setOrderService(@Lazy OrderService order) {
		this.order = order;
	}
}
