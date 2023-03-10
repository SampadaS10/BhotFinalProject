package com.example.demo.Controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Cart;
import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;
import com.example.demo.repo.CartRepo;

@Controller
public class CartController {
	@Autowired
	private CartRepo cartrepo;
	@PostMapping("/addCartData")
	public String insert(@ModelAttribute Cart newCart,@RequestParam("product_id") int id) {
	System.out.println("Product_id="+id);
	System.out.println("Cart:"+newCart);
	Cart newData = cartrepo.save(newCart);
	//int id=newCart.getProduct_id();
	return "redirect:/viewProductDescription"+id;
	
	}
}
