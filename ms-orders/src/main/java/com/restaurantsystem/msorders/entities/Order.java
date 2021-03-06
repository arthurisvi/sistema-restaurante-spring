package com.restaurantsystem.msorders.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 5000)
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

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	
}
