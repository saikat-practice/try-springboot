package com.springboot.practice.intialize.controller;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.intialize.scope.prototype.PrototypeTask;
import com.springboot.practice.intialize.scope.singleton.SingletonCounter;

@RestController
@RequestMapping("api/scope")
public class ScopeController {

	@Autowired
	private SingletonCounter singletonCounter;
	
//	@Autowired
//	private PrototypeTask prototypeTask;
	@Autowired
    private ObjectProvider<PrototypeTask> prototypeProvider; 
	
	@GetMapping("/singleton-test")
	public String testSingletonBean() {
		singletonCounter.increment(); //increment obj var "counter" separately
		return "Singleton counter: " + singletonCounter.getCounter();
	}
	
	@GetMapping("/prototype-test")
    public String testPrototype() {
		PrototypeTask task1 = prototypeProvider.getObject();
        PrototypeTask task2 = prototypeProvider.getObject();
        return "Prototype Task1: " + task1.getTask() + ", Task2: " + task2.getTask();
    }
}
