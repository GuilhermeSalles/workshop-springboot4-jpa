package com.aulaGuilherme.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaGuilherme.course.entities.User;
import com.aulaGuilherme.course.repositories.UserRepository;

@Service
public class Userservice {

	@Autowired
	private UserRepository repository;
	
	public List<User> fundAll(){
		return repository.findAll(); 
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
