package com.juno.house.filter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterBeanConfig {
	
	@Bean
	public FilterRegistrationBean<Filter> logFilter(){
		FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
		
		filterRegistrationBean.setFilter(new LogFilter());
		
		List<String> uList = new ArrayList<>();
		
		uList.add("*");
		
		filterRegistrationBean.setUrlPatterns(uList);
		
		return filterRegistrationBean;
	}

}
