package com.example.demo.Controller;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Product;
	import com.example.demo.repo.ProductRepo;

	@Controller
	public class viewProductDetailController {
	

	
	

		@Autowired
		private ProductRepo productrepo;

		@GetMapping("/viewProductDescription{id}")
		public String ViewProducts(@PathVariable("id") int id,Model model) {
			
			System.out.println(id);
			Product product=productrepo.findById(id);
			model.addAttribute("product", product);
			
			return "customer/viewProductDescription.html";
		}

}
