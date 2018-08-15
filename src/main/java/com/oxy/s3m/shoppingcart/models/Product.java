package com.oxy.s3m.shoppingcart.models;

public class Product {

	private String productId;
	private String productCategory;
	private String productName;
	private long productQuantity;
	private float productPrice;
	private float productDiscount;
	private float productDiscountedPrice;
	private float productFinalPrice;
	private String productCurrency;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(long productQuantity) {
		this.productQuantity = productQuantity;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public float getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(float productDiscount) {
		this.productDiscount = productDiscount;
	}

	public float getProductDiscountedPrice() {
		return productDiscountedPrice;
	}

	public void setProductDiscountedPrice(float productDiscountedPrice) {
		this.productDiscountedPrice = productDiscountedPrice;
	}

	public float getProductFinalPrice() {
		return productFinalPrice;
	}

	public void setProductFinalPrice(float productFinalPrice) {
		this.productFinalPrice = productFinalPrice;
	}

	public String getProductCurrency() {
		return productCurrency;
	}

	public void setProductCurrency(String productCurrency) {
		this.productCurrency = productCurrency;
	}

}