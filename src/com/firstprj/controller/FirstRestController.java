package com.firstprj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstprj.beans.UserBean;

@RestController
public class FirstRestController {

	@RequestMapping(value="/user")
	public UserBean getUserDetails(){
		UserBean userObj = new UserBean("Sudeep", "Gokavi", 36);
		return userObj;
	}

	@RequestMapping(value="/users")
	public List<UserBean> getUsers(){
		UserBean userObj = new UserBean("Sudeep", "Gokavi", 36);
		UserBean userObj1 = new UserBean("Sudeep", "Gokavi", 36);
		UserBean userObj2 = new UserBean("Sudeep", "Gokavi", 36);
		List<UserBean> userBeanList = new ArrayList<UserBean>();
		userBeanList.add(userObj1);
		userBeanList.add(userObj);
		userBeanList.add(userObj2);
		return userBeanList;
	}

}
