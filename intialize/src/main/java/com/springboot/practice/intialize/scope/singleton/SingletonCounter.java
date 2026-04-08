package com.springboot.practice.intialize.scope.singleton;

import org.springframework.stereotype.Service;

@Service 
// @Scope("singleton") not needed as Scope singleton by default
public class SingletonCounter {
	private static int instanceCounter = 0;
	private int counter = 0; 
	//as we know only one instance would be created and reused, so added a counter to count total creation call
	
	public SingletonCounter() {
		instanceCounter++;
		System.out.println("Singleton instance created, ID: " + instanceCounter);
	}
	
	public void increment() {
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}
	
}
