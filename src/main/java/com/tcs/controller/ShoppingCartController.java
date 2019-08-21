package com.tcs.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.bean.Cart;
import com.tcs.bean.Item;
import com.tcs.bean.AddItemRequest;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

	@RequestMapping(value="/getAllCartItems", produces = "application/json", method = RequestMethod.GET)
	public List<Item> getAllCartItems(String cartId) {
		return new Cart().getCartItems();
	}
	
	@RequestMapping(value="/getCartDetails", produces = "application/json", method = RequestMethod.GET)
	public Cart getCartDetails(String userId) {
		Cart cart = new Cart();
		return cart;
	}
	
	@RequestMapping(value="/getCartId", produces = "text/html", method = RequestMethod.GET)
	public String getCartId(String userId) {
		String cartId =  getCartDetails(userId).getCartId();
		return cartId;
	}

	@RequestMapping(value="/addItemToCart", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public Cart addItemToCart(@RequestBody String itemString){
		AddItemRequest item = new AddItemRequest();
		try {
			item = new ObjectMapper().readValue(itemString, AddItemRequest.class);
		}
		catch(JsonParseException jpe) {
			System.out.println("jpe" + jpe.getMessage());
		}catch(JsonMappingException jme) {
			System.out.println("jme" + jme.getMessage()); 
		}catch(IOException ie) {
			System.out.println("ie" + ie.getMessage());
		}
		Cart cart = new Cart();
		cart.getCartItems().add(item.getItem());
		return cart;
	}

}
