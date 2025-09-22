package com.java.main.services;

import org.springframework.stereotype.Service;

import com.java.main.entities.User;

@Service
public interface UserService {
	
   public boolean userRegistration(User user);
   public User loginUser(String email, String password);
}
