package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<com.example.demo.Entity.Product, Integer> 
{

}
