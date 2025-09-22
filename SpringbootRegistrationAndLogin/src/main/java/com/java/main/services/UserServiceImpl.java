package com.java.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.main.entities.User;
import com.java.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean userRegistration(User user) {
		
		try {
		userRepository.save(user);
		return true;
		
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	public User loginUser(String email, String password) {
		
		User validUser =  userRepository.findByEmail(email);
		
		if(validUser != null && validUser.getPassword().equals(password)) {
			return validUser;
		}
		
		return null;
	}

}
