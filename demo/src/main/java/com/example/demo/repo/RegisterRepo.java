package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Category;
import com.example.demo.Entity.User;

public interface RegisterRepo  extends JpaRepository<User, Integer>  {

}
