package com.meetups.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meetups.dao.*;
import com.meetups.model.User;
@RestController
public class UserController {
	@Autowired
	private UserDao userDao;
	@RequestMapping(value="/addUser", method=RequestMethod.POST,headers="Accept=application/json")
	public void addUser(@RequestBody User user)
	{
		System.out.println("Inside the adduser ");
		userDao.addUser(user);
	}
	 @RequestMapping(value="/authenticate", method=RequestMethod.POST,headers="Accept=application/json")
	 public int authenticateUser(@RequestBody User user)
	 {
		 System.out.println("username:"+user.getEmail());
		 System.out.println("password:"+user.getPassword());
	    int result=0;
		 result=userDao.validateUser(user.getEmail(),user.getPassword());
		 System.out.println("result we have got is:"+result);
		 return result;
	 }
}
