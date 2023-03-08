package com.example.demo.Controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;
import com.example.demo.repo.CategoryRepo;
import com.example.demo.repo.ProductRepo;


@Controller
//@RequestMapping("/example")
public class ProductController 
{
	@Autowired
	private ProductRepo prodrepo;

	@Autowired
	private CategoryRepo catrepo;
	
	@GetMapping("/addproduct")
	public String addproduct(Model model) 
	{
		 List<Category> categories=catrepo.findAll(); 
		 model.addAttribute("categories",categories);
		return "admin/add_product";
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity<?> insert(@ModelAttribute Product newproduct)
	{
		URI view_prod=null;
		try 
		{
			view_prod = new URI("http://localhost:8070/view_product");
			Product prod_inserted=prodrepo.save(newproduct);
		} 
		catch (URISyntaxException e) 
		{
			e.printStackTrace();
		}
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.setLocation(view_prod);
		return new ResponseEntity<>(httpHeader,HttpStatus.SEE_OTHER);
	}
	
	@GetMapping("/view_product")
	public String view_prod(Model model) 
	{
		List<Product> products=prodrepo.findAll(); 
		 model.addAttribute("products",products);
		return "admin/view_product";
	}
	
	@GetMapping("/index")
	public String index(Model m)
	{
		List<Product> lst=prodrepo.FindCategory();
		m.addAttribute("list",lst);
		return "admin/index";
	}
	
	@GetMapping("/deleteproduct{id}")
	public String DeleteCategoryget(@PathVariable int id)
	{
		prodrepo.deleteById(id);
		return "redirect:/view_product";
	}
}
