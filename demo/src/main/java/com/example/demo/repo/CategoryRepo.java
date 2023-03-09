package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Category;


public interface CategoryRepo extends JpaRepository<Category, Integer> 
{
	@Query("select c from Category c")
	List<Category> FindCategory();
}
