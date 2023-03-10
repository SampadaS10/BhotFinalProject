package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.User;
import com.example.demo.repo.RegisterRepo;
import com.example.demo.repo.TestRepo;
import com.example.demo.repo.UserRepo;

@Controller
public class RegistrationController {
	@Autowired
	private RegisterRepo repo;
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/register")
	public String registerUser() {
		return "customer/register";
	}
	
	@PostMapping("/register")
	public String addUser(@ModelAttribute("user") User user) {
		User newUser=userRepo.save(user);
		System.out.println(newUser);
		return "customer/register";
	}
	

}
