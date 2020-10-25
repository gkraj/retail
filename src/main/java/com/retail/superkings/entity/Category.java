package com.retail.superkings.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="category")
public class Category {

	@Id
	private String cName;
	private List<String> productList;
	
	protected Category() {
		
	}

	public Category(String cName, List<String> productList) {
		super();
		this.cName = cName;
		this.productList = productList;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "Category [cName=" + cName + ", productList=" + productList + "]";
	}
	
	
}
