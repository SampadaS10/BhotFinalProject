package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController 
{

	@GetMapping("/orderhistory")
	public String orderhistory()
	{
		return "admin/order_history";
	}
}
