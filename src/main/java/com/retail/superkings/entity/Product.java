package com.retail.superkings.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class Product {

	private String pName;
	private String Description;
	private String Inventory;
	private String category;
	private String Rating;
	
	protected Product() {
		
	}

	public Product(String pName, String description, String inventory, String category, String rating) {
		super();
		this.pName = pName;
		Description = description;
		Inventory = inventory;
		this.category = category;
		Rating = rating;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getInventory() {
		return Inventory;
	}

	public void setInventory(String inventory) {
		Inventory = inventory;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRating() {
		return Rating;
	}

	public void setRating(String rating) {
		Rating = rating;
	}

	
	
	
}
