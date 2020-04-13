package com.example.curso.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.curso.entity.User;

public interface IUserService extends UserDetailsService{

	public List<User> findAll();
	
	public void save (User user);
	
	public User findById(Long id);
	
}
