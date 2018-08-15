package com.oxy.s3m.shoppingcart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
//@RequestMapping("/services")
public class App 
{
	@RequestMapping(value = "/hello", method = RequestMethod.GET)	
    public String hello(){
    	return "Hello ... !" ;
    }
}
