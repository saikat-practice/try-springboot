package com.springboot.practice.intialize.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("Intercepting "+request.getRequestURI());
		
		if("/api/greet/intercepting-code".equals(request.getRequestURI()))
			return true	;
		
		return false;
	}
}
