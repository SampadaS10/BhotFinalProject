package com.example.demo.Entity;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int payment_id;
	private int user_id;
	private int order_id;
	private String amount;
	private String signature_code;
	private Date payment_date;
	private String status;
	
	
	public PaymentDetails(int payment_id, int user_id, int order_id, String amount, String signature_code,
			Date payment_date, String status) {
		super();
		this.payment_id = payment_id;
		this.user_id = user_id;
		this.order_id = order_id;
		this.amount = amount;
		this.signature_code = signature_code;
		this.payment_date = payment_date;
		this.status = status;
		
		
	}


	public int getPayment_id() {
		return payment_id;
	}


	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getOrder_id() {
		return order_id;
	}


	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getSignature_code() {
		return signature_code;
	}


	public void setSignature_code(String signature_code) {
		this.signature_code = signature_code;
	}


	public Date getPayment_date() {
		return payment_date;
	}


	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public int hashCode() {
		return Objects.hash(amount, order_id, payment_date, payment_id, signature_code, status, user_id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentDetails other = (PaymentDetails) obj;
		return Objects.equals(amount, other.amount) && order_id == other.order_id
				&& Objects.equals(payment_date, other.payment_date) && payment_id == other.payment_id
				&& Objects.equals(signature_code, other.signature_code) && Objects.equals(status, other.status)
				&& user_id == other.user_id;
	}
	
	
	
	
	
	
	
	
	

	
}
