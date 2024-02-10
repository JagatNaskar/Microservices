package com.user.service.UserService.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.UserService.entities.User;
import com.user.service.UserService.exception.ResourceNotFound;
import com.user.service.UserService.repository.UserRepository;
import com.user.service.UserService.service.UserService;

@Service
public class ServiceImplementation implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	
	@Override
	public User getUser(String userId) {
		User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFound("User not found with id "+userId));
		return user;
	}

	@Override
	public boolean deleteUser(String id) {
		userRepository.deleteById(id);
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		java.util.Optional<User> repoUser = userRepository.findById(user.getUserId());
		repoUser.get().setUserId(user.getUserId());
		repoUser.get().setName(user.getName());
		repoUser.get().setAbout(user.getAbout());
		repoUser.get().setEmail(user.getEmail());
		userRepository.save(repoUser);
		return true;
	}

}
