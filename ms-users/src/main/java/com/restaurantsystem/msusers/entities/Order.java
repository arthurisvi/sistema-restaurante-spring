package com.restaurantsystem.msusers.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;

public class Order {
	private Long id;
	private ArrayList<Product> products;
	private Long user_id;
	private Instant created_at = Instant.now();
	private Long paymentId = new Payment().getId();
	private BigDecimal total;
	public Order() {
		
	}
	
	public Order(ArrayList<Product> products, Long user_id, Long paymentId) {
		super();
		this.products = products;
		this.user_id = user_id;
		this.paymentId = paymentId;
	}
	
	public BigDecimal totalPrice() {
		BigDecimal total = new BigDecimal(0);
		
		for(int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getPrice());
			total = total.add(products.get(i).getPrice());
		}
		return total;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Instant getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Instant created_at) {
		this.created_at = created_at;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	@Override
	public String toString() {
		return "Order [created_at=" + created_at + ", id=" + id + ", paymentId=" + paymentId + ", products=" + products
				+ ", user_id=" + user_id + "]";
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	
}
