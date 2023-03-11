package com.example.demo.Controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Cart;
import com.example.demo.Entity.Category;
import com.example.demo.Entity.Product;
import com.example.demo.repo.CartRepo;
import com.example.demo.repo.ProductRepo;
import com.example.demo.repo.UserRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class CartController {
	@Autowired
	private CartRepo cartrepo;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private ProductRepo prodRepo;

	@PostMapping("/addCartData")
	public String insert(@ModelAttribute Cart newCart, @RequestParam("product_id") int id) {
		System.out.println("Product_id=" + id);
		System.out.println("Cart:" + newCart);
		Cart newData = cartrepo.save(newCart);
		// int id=newCart.getProduct_id();
		return "redirect:/viewProductDescription" + id;

	}

	@GetMapping("/cartDetail")
	public String viewCartDetail(Model model, HttpSession session) {
		
		if (session.getAttribute("session_id") != null) {
			int id=(int)session.getAttribute("user_id");
			System.out.println("ID="+id);
			List<Cart> cartList= cartrepo.findByUser_id(id);
			System.out.println("CartList item="+cartList.toString());
			List<Product> products=new ArrayList<Product>();
			for (Cart cart : cartList) {
				Product prod=prodRepo.getById(cart.getProduct_id());
				products.add(prod);
				model.addAttribute("products", products);
			}
			//model.addAllAttributes(products);
			
			return "customer/cartDetail";
		}
		return "redirect:/login";
	}
}
