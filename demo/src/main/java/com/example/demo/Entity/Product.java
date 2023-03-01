package com.example.demo.Entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int product_id;
	private int category_id;
	private String product_name;
	private int price;
	private String product_description;
	private String product_image;
	private String status;
	private int product_quantity;
	private Date created_on;
	private Date modified_on;
	
	public Product() {
		super();
	}

	public Product(int product_id, int category_id, String product_name, int price, String product_description,
			String product_image, String status, int product_quantity, Date created_on, Date modified_on) {
		super();
		this.product_id = product_id;
		this.category_id = category_id;
		this.product_name = product_name;
		this.price = price;
		this.product_description = product_description;
		this.product_image = product_image;
		this.status = status;
		this.product_quantity = product_quantity;
		this.created_on = created_on;
		this.modified_on = modified_on;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
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
		return "Product [product_id=" + product_id + ", category_id=" + category_id + ", product_name=" + product_name
				+ ", price=" + price + ", product_description=" + product_description + ", product_image="
				+ product_image + ", status=" + status + ", product_quantity=" + product_quantity + ", created_on="
				+ created_on + ", modified_on=" + modified_on + "]";
	}
	
	
	
	
}
