package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.User;
import com.example.demo.repo.UserRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

		@Autowired
		UserRepo userRepo;
		
		@GetMapping("/login")
		public String login() {
			return "customer/login";
		}
		
		@PostMapping("/validate")
		public String validateUser(@ModelAttribute ("user") User user,HttpSession session) {
			System.out.println(user.getEmail()+" "+user.getPassword());
			User foundUser=userRepo.findByEmail(user.getEmail());
			if(foundUser!=null) {
				if(foundUser.getPassword().equals(user.getPassword())) {
					session.setAttribute("session_id",session.getId());
					System.out.println(session.getId());
					session.setAttribute("user_id", foundUser.getId());
					System.out.println("Userid "+foundUser.getId());
					return "redirect:/Home";
				}else {
					return "redirect:/login";
				}
			}
			return "customer/login";
		}
}
