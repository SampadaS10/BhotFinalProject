package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	

	private String name;
	private String address;
	private long contact_no;
	private String password;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
	}
	public User(int id, String name, String address, long contact_no, String password) {
		super();
		this.user_id = id;
		this.name = name;
		this.address = address;
		this.contact_no = contact_no;
		this.password = password;
	}
	public int getId() {
		return user_id;
	}
	public void setId(int id) {
		this.user_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + user_id + ", name=" + name + ", address=" + address + ", contact_no=" + contact_no
				+ ", password=" + password + "]";
	}
	
	


}
