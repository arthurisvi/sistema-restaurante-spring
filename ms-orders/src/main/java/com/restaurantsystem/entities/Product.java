package com.restaurantsystem.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String imageUrl;
	private BigDecimal price;
	private Category category;
	private String description;
	
	public Product() {
		
	}
	
	public Product(Long id, String name, String imageUrl, BigDecimal price, Category category, String description) {
		super();
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.price = price;
		this.category = category;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
