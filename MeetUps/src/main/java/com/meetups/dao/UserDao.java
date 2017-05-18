package com.meetups.dao;

import com.meetups.model.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
@ComponentScan("com.meetups")
@Repository
public interface UserDao {
	void addUser(User user);
	int validateUser(String email,String password);
	/*List<User> viewUsers();	
	void update(User user);
	User viewUserById(int id);*/
	//int validateUser(String username,String password);
}
