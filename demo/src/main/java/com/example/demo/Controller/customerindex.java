package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.Entity.Product;
import com.example.demo.repo.ProductRepo;

@Controller
//@RequestMapping("/product")
public class customerindex {
	@Autowired
	private ProductRepo productrepo;

	@GetMapping("/Home")
	public String ViewProducts(Model model) {

		List<Product> products = productrepo.findAll();
		model.addAttribute("products", products);

		// itr.forEach(t -> {System.out.println(t);});
		return "customer/index";
	}

	
	}


