package com.house.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

	private static final Logger logger = LoggerFactory.getLogger(ErrorHandler.class);
	
	@ExceptionHandler(value= {Exception.class, RuntimeException.class})
	public String error500(HttpServletRequest request, Exception e) {
		
		return "error/500";
	}
}
