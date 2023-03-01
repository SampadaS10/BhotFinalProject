package com.example.demo.Controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import java.net.http.HttpClient.Redirect;
import java.util.Collection;
//import java.net.http.HttpHeaders;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Category;
import com.example.demo.repo.CategoryRepo;


@Controller
//@RequestMapping("/category")
public class CategoryController 
{
	@Autowired
	private CategoryRepo catrepo;
	
	@GetMapping("/addcategory")
	public String index() {
		return "admin/add_category";
	}
	
		
	@PostMapping("/addcategory")
	public ResponseEntity<?> insert(@ModelAttribute Category newcategory)
	{
		URI view_cat=null;
		try {
			view_cat = new URI("http://localhost:8070/view_category");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.setLocation(view_cat);
		//Category category_inserted=catrepo.save(newcategory);
		//System.out.println(category_inserted);
		return new ResponseEntity<>(httpHeader,HttpStatus.SEE_OTHER);
	}
	
	@GetMapping("/view_category")
	public String ViewCategories(Model model)
	{
		
//		 Iterable<Category> itr= catrepo.findAll();
//		 Iterator<Category> iterator=itr.iterator();
//		 while(iterator.hasNext()) {
//			 Category te=iterator.next();
//			 System.out.println(te);
//			 }
//		 model.addAttribute("allCategories", iterator);
		
		
		 List<Category> categories=catrepo.findAll(); model.addAttribute("categories",categories);
		
		//itr.forEach(t -> {System.out.println(t);});
		return "admin/view_category";
	}
}
