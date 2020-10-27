package com.retail.superkings.bean;

import java.util.List;

public class ResponseBean {

	private List<String> payLoad;
	private String statusMessage;
	private String UserName;
	
	public ResponseBean(List<String> payLoad, String statusMessage, String userName) {
		super();
		this.payLoad = payLoad;
		this.statusMessage = statusMessage;
		UserName = userName;
	}

	public List<String> getPayLoad() {
		return payLoad;
	}

	public void setPayLoad(List<String> payLoad) {
		this.payLoad = payLoad;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}
	
	
}
