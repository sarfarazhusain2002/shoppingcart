package com.oxy.s3m.shoppingcart.models;

public class TransactionResponse {
	private String status;
	private String orderId;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
