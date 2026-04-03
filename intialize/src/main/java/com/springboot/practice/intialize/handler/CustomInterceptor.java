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

		System.out.println("Intercepting header "+request.getHeader("Intercepting-Code"));
		
		if("secret_code".equals(request.getHeader("Intercepting-Code"))) 
			return true;
		else
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//			response.setContentType("application/json"); 
			response.getWriter().write("Invalid intercepting code");
		
		return false;
	}
}
