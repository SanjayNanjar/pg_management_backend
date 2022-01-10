package com.sanjay.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sanjay.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

}
