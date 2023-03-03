package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.repo.RegisterRepo;
import com.example.demo.repo.TestRepo;

@Controller
public class RegistrationController {
	@Autowired
	private RegisterRepo repo;
	
	

}
