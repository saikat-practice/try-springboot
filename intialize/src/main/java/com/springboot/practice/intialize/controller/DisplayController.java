package com.springboot.practice.intialize.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.intialize.service.UserService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@RestController
@RequestMapping("/api")
public class DisplayController {
	
	@Autowired
	private UserService user;
	
	private ConfigurableApplicationContext context; 
    
    public DisplayController(ConfigurableApplicationContext context) {  // Inject via constructor
        this.context = context;
    }
	
	@Value("${display.name}")
    private String name;
	
	@Value("${environment}")
    private String env;
	
	@PostConstruct
	public void init() {
		System.out.println("Post Bean initialization");
	}
	
	
	//added custom intercepter
	@GetMapping("/greet")
    public String getWish() {
		
		return "Hello "+name+" ."+"We are in "+env+" environment";
	}
	
	
	//returned login name in api call
	@GetMapping("/generic")
    public String getHello(Principal principal) {
		
		return "Hello "+ principal.getName();
	}
	
	
	
	// trying to reach predestroy and serve the api request simultaneously
	@GetMapping("/shutdown")
	public String shutdown() {
		// Start shutdown in a background thread
	    new Thread(() -> {
	        try {
	            Thread.sleep(100);  // Give response time to send back
	            context.close();  // Triggers @PreDestroy
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }).start();
	    
	    return "Shutting down...";  // Returns immediately
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Before bean destruction");
	}
	
}
