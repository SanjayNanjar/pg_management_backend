package com.sanjay.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sanjay.dao.UserDao;
import com.sanjay.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;

	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
