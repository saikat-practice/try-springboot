package com.springboot.practice.intialize.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.springboot.practice.intialize.handler.CustomInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	
    private CustomInterceptor greetIntrceptor;
	
	public InterceptorConfig(CustomInterceptor greetIntrceptor) {
		this.greetIntrceptor = greetIntrceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(greetIntrceptor).addPathPatterns("/api/greet");
	}
}
