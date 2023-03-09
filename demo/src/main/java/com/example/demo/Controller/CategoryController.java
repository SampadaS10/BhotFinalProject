package com.example.demo.Controller;


import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.Entity.Category;
import com.example.demo.repo.CategoryRepo;


@Controller
//@RequestMapping("/category")
public class CategoryController 
{
	@Autowired
	private CategoryRepo catrepo;
	
//	@GetMapping("/vendorindex")
//	public String vendorindex() {
//		return "vendor/index";
//	}
	
	@GetMapping("/addcategory")
	public String addcategory() {
		return "admin/add_category";
	}
	
		
	@PostMapping("/addcategory")
	public String insert(@ModelAttribute Category newcategory) {
		System.out.println(newcategory.getCategory_name()+"----");
		Iterable<Category> itr = catrepo.findAll();
		Iterator<Category> iterator = itr.iterator();
		Boolean flag = false;
		while (iterator.hasNext()) {
			Category te = iterator.next();
			// System.out.println(te.getCategory_name());
			if (te.getCategory_name().equals(newcategory.getCategory_name()))
				flag = true;
			else
				flag = false;
		}
		if (flag == true) {
			System.out.println("Sorry");
			return "redirect:/addcategoryerr";
		} 
		else 
		{
			catrepo.save(newcategory);
			return "redirect:/view_category";
		}
	}
	
	@GetMapping("/addcategoryerr")
	public String AddCategoryErr()
	{
		return "admin/add_categoryerr";
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
		
		
		 List<Category> categories=catrepo.findAll(); 
		 model.addAttribute("categories",categories);
		return "vendor/view_category";
	}
	
	@GetMapping("/deletecategory{id}")
	public String DeleteCategoryget(@PathVariable int id)
	{
		catrepo.deleteById(id);
		return "redirect:/view_category";
	}
}
