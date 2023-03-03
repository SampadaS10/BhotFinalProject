package com.example.demo.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String insert(@ModelAttribute Category newcategory)
	{

		Category category_inserted=catrepo.save(newcategory);
		System.out.println(category_inserted);
		return "redirect:/view_category";
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
		
		//itr.forEach(t -> {System.out.println(t);});
		return "admin/view_category";
	}
}
