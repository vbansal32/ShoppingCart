package com.tcs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ShoppingCart")
public class ShoppingCartController {

	@RequestMapping("/getAllItems")
	public String getTotalItems() {
		return "5";
	}
	
	@RequestMapping(value="/getCartDetails", produces = "application/json", method = RequestMethod.GET)
	public String getCartDetails() {
		return "5";
	}
	

}
