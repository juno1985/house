package com.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.house.common.model.User;
import com.house.service.UserService;

@Controller
public class HelloController {

	@Autowired
	private UserService userService;
	@RequestMapping("hello")
	public String hello(ModelMap modelMap) {
		List<User> users = userService.getUsers();
		User first = users.get(0);
		modelMap.put("user", first);
		return "hello";
	}
	
	@RequestMapping("index")
	public String index() {
		return "homepage/index";
	}
}
