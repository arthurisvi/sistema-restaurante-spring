package com.restaurantsystem.entities;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String products;
	@Transient //anotacao para nao salvar esse atributo no banco
	private Long user_id;
	private Instant created_at = Instant.now();
	
	public Order(String products, Long user_id) {
		super();
		this.products = products;
		this.user_id = user_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public Long getUserId() {
		return user_id;
	}

	public void setUserId(Long user_id) {
		this.user_id = user_id;
	}

	public Instant getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Instant created_at) {
		this.created_at = created_at;
	}
	
}
