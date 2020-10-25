package com.retail.superkings.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class Product {

	private String pName;
	private String Description;
	private String Inventory;
	
	protected Product() {
		
	}

	public Product(String pName, String description, String inventory) {
		super();
		this.pName = pName;
		Description = description;
		Inventory = inventory;
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

	@Override
	public String toString() {
		return "Product [pName=" + pName + ", Description=" + Description + ", Inventory=" + Inventory + "]";
	}
	
	
}
