package com.springboot.practice.intialize.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ConfigTest")
public class SameClassTest {

	//org.springframework.beans.factory.BeanDefinitionStoreException: Failed to parse configuration class 
	//[com.springboot.practice.intialize.IntializeApplication]
	
	//Caused by: org.springframework.context.annotation.ConflictingBeanDefinitionException: Annotation-specified bean name 'sameClassTest' for bean class 
	//[com.springboot.practice.intialize.handler.SameClassTest] conflicts with existing, non-compatible bean definition of same name and class 
	//[com.springboot.practice.intialize.config.SameClassTest]
}
