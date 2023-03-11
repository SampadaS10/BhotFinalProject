package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import com.example.demo.Entity.Cart;


public interface CartRepo extends JpaRepository<Cart, Integer> 
{
	@Query(value="select * from cart where user_id=?",nativeQuery = true)
	public List<Cart>  findByUser_id(int id);
}
