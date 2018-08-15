package com.oxy.s3m.shoppingcart.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oxy.s3m.shoppingcart.models.TransactionResponse;

@RestController
@RequestMapping("/services/cart")
public class ShoppingCartController {

	@RequestMapping(value = "/addTransaction", method = RequestMethod.POST)
	public TransactionResponse addTransaction(final HttpServletRequest request,
			final HttpServletResponse response) {
		final TransactionResponse transactionResponse = new TransactionResponse();
		transactionResponse.setStatus("SUCCESS");
		transactionResponse.setOrderId("123456");
		return transactionResponse;
	}
}
