package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> 
{
	@Query("select p from Product p")
	List<Product> FindProducts();
	Product findById(int id);
}
