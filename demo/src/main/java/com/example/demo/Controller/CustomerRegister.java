package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;
import com.example.demo.repo.CategoryRepo;
import com.example.demo.repo.ProductRepo;

@Controller
//@RequestMapping("/product")
public class CustomerRegister {
	
		@Autowired
		private ProductRepo productrepo;
		
		
		@GetMapping("/Register")
		public String ViewProducts(Model model)
		{

			 List<Product> products=productrepo.findAll(); 
			 model.addAttribute("products",products);
			
			//itr.forEach(t -> {System.out.println(t);});
			return "customer/account";
		}
	}


