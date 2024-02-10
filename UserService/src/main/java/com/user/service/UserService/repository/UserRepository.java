package com.user.service.UserService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.service.UserService.entities.User;

public interface UserRepository extends JpaRepository<User, String>
{

	void save(Optional<User> repoUser);
	
}

