package com.example.demo.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TestEntity 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;

	
	public TestEntity() {
		
	}

	public TestEntity(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestEntity [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
