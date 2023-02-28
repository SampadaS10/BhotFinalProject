package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cat_id;
	private String name;
	private Date created_on;
	private Date modified_on;

	public Category() {
		super();
	}

	public Category(int cat_id, String name, Date created_on, Date modified_on) {
		super();
		this.cat_id = cat_id;
		this.name = name;
		this.created_on = created_on;
		this.modified_on = modified_on;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public Date getModified_on() {
		return modified_on;
	}

	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}

	@Override
	public String toString() {
		return "Category [cat_id=" + cat_id + ", name=" + name + ", created_on=" + created_on + ", modified_on="
				+ modified_on + "]";
	}
	

}
