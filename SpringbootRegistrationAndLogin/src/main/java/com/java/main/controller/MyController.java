package com.java.main.controller;

import java.net.http.HttpRequest;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.main.entities.User;
import com.java.main.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class MyController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/Register")
	public String openRegistrationPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user")User user, Model model) {
		
		boolean status = userService.userRegistration(user);
		
		if(status) {
			model.addAttribute("successMsg", "User registered successfully!");
		}
		else {
			model.addAttribute("errorMsg", "Failed to register");
		}
		return "register";
	}

	@GetMapping("/Login")
	public String openLoginPage(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/loginForm")
    public String submitLogin(@ModelAttribute("user") User user, Model model) {
		User validUser = userService.loginUser(user.getEmail(), user.getPassword());
		
		if(validUser != null) {
			model.addAttribute("name", validUser.getName());
			return "profile";
		}
		
		else {
			model.addAttribute("errorMsg", "Invalid emailId or password");
    	    return "login";
		}
	}
		
		@GetMapping("/Logout")
		public String logout(HttpServletRequest request) {
			
			HttpSession session = request.getSession(false);
			
			if(session != null) {
				session.invalidate();
			}
			
			return "redirect:/Login";
		}
    }
	

