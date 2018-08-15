package com.oxy.s3m.shoppingcart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class Home {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "Home ... !";
	}
}
