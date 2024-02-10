package com.user.service.UserService.service;

import java.util.List;

import com.user.service.UserService.entities.User;

public interface UserService {

	//create user
	User saveUser(User user);
	
	//get all users
	List<User> getAllUser();
	
	//get a user by ID
	User getUser(String userId);
	
	//Delete a user
	boolean deleteUser(String id);
	
	//update a user
	boolean updateUser(User user);
}
