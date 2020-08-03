package com.juno.house.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LogFilter implements Filter{

	private static Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		logger.info("Request is comming ----->");
		chain.doFilter(request, response);
						
	}

}
