package com.java.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.main.entities.User;


//DAO Layer - acts as repository layer
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);
}
