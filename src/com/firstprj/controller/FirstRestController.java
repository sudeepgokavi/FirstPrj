package com.firstprj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstprj.beans.UserBean;

@RestController
public class FirstRestController {

	@RequestMapping(value="/users")
	public UserBean getUserDetails(){
		UserBean userObj = new UserBean("Sudeep", "Gokavi", 36);
		return userObj;
	}
}
