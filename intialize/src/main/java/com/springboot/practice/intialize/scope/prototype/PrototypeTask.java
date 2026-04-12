package com.springboot.practice.intialize.scope.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeTask {
	private static int instanceCount = 0;
	private int task;
	
	public PrototypeTask() {
		instanceCount++;
		this.task = instanceCount;
		System.out.println("Prototype instance created, ID: " + task);
	}
	
	public int getTask() {
		return task;
	}
}
