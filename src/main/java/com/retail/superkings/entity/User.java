package com.retail.superkings.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {

	@Id
	//private Object _id;
	private String userId;
	private String userName;
	private String userPw;
	
	protected User() {
		
	}

	public User(String userid, String userName, String userPw) {
		super();
		this.userId = userid;
		this.userName = userName;
		this.userPw = userPw;
	}

	public String getUserid() {
		return userId;
	}

	public void setUserid(String userid) {
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


	
	
}

