package com.retail.superkings.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {

	@Id
	private Object _id;
	private Long userId;
	private String userName;
	private String userPw;
	private List<String> productList;
	
	protected User() {
		
	}

	public User(Long userid, String userName, String userPw, List<String> productList) {
		super();
		this.userId = userid;
		this.userName = userName;
		this.userPw = userPw;
		this.productList = productList;
	}

	public Long getUserid() {
		return userId;
	}

	public void setUserid(Long userid) {
		this.userId = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}
	
	
	
}

