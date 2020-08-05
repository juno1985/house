package com.juno.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juno.house.common.model.User;
import com.juno.house.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("users")
	public List<User> getUsers(){
		return userService.getUsers();
	}

}
