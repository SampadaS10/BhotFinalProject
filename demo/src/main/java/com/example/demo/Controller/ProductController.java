package com.example.demo.Controller;

import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.Entity.Product;
import com.example.demo.repo.ProductRepo;


@Controller
//@RequestMapping("/example")
public class ProductController 
{
	@Autowired
	private ProductRepo prodrepo;

	@GetMapping("/addproduct")
	public String index() {
		return "admin/add_product";
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity<?> insert(@ModelAttribute Product newproduct)
	{
		URI view_prod=null;
		try 
		{
			view_prod = new URI("http://localhost:8070/view_product");
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
	public String view_prod() {
		return "admin/view_product";
	}
}
