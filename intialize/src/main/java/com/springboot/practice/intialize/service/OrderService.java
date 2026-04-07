package com.springboot.practice.intialize.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	private UserService user;
	
//	public OrderService (@Lazy UserService user) {
//		this.user = user;
//	}
	
	@Autowired
	public void setUserService(@Lazy UserService user) {
		this.user = user;
	}
}
