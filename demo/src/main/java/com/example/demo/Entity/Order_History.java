package com.example.demo.Entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order_History {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int order_id;
	private String uOrder_id;
	private String order_detail;
	private Date order_date;
	private Date delivery_date;
	private String status_note;
	private Date status_date;
	
	
	public Order_History() {
		super();
		
	}
	
	public Order_History(int order_id, String uOrder_id, String order_detail, Date order_date, Date delivery_date,
			String status_note, Date status_date) {
		super();
		this.order_id = order_id;
		this.uOrder_id = uOrder_id;
		this.order_detail = order_detail;
		this.order_date = order_date;
		this.delivery_date = delivery_date;
		this.status_note = status_note;
		this.status_date = status_date;
	}
	
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getuOrder_id() {
		return uOrder_id;
	}
	public void setuOrder_id(String uOrder_id) {
		this.uOrder_id = uOrder_id;
	}
	public String getOrder_detail() {
		return order_detail;
	}
	public void setOrder_detail(String order_detail) {
		this.order_detail = order_detail;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}
	public String getStatus_note() {
		return status_note;
	}
	public void setStatus_note(String status_note) {
		this.status_note = status_note;
	}
	public Date getStatus_date() {
		return status_date;
	}
	public void setStatus_date(Date status_date) {
		this.status_date = status_date;
	}

	
	@Override
	public String toString() {
		return "Order_History [order_id=" + order_id + ", uOrder_id=" + uOrder_id + ", order_detail=" + order_detail
				+ ", order_date=" + order_date + ", delivery_date=" + delivery_date + ", status_note=" + status_note
				+ ", status_date=" + status_date + "]";
	}	
}
