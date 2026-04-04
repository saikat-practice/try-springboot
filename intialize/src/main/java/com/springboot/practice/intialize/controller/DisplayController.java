package com.springboot.practice.intialize.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DisplayController {
	
	@Value("${display.name}")
    private String name;
	
	@Value("${environment}")
    private String env;
	
	@GetMapping("/greet")
    public String getWish() {
		
		return "Hello "+name+" ."+"We are in "+env+" environment";
	}
	
	@GetMapping("/generic")
    public String getHello() {
		
		return "Hello User";
	}
}
