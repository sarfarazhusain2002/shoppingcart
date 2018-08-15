package com.oxy.s3m.shoppingcart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oxy.s3m.shoppingcart.models.Product;

@RestController
@RequestMapping("/services/product")
public class ProductDetailController {

	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public Product getProduct(
			@RequestParam("product_id") final String product_id) {

		final Product product = new Product();
		product.setProductId("9");
		product.setProductCategory("Grocery");
		product.setProductName("SUNFLOWER OIL");
		product.setProductQuantity(1);
		product.setProductPrice(800);
		product.setProductDiscount(50);
		product.setProductDiscountedPrice(400);
		product.setProductFinalPrice(400);
		product.setProductCurrency("INR");

		return product;
	}
	
	
}
