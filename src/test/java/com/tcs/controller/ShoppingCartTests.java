package com.tcs.controller;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

@SpringBootTest
public class ShoppingCartTests {

	@BeforeMethod
	public void beforeMethod() {
		
	}
	
	@Test
	public void getCartIdVerify() {
		ShoppingCartController cartController = new ShoppingCartController();
		String cartId = cartController.getCartId("user1");
		System.out.println("cartId= " + cartId);
		Assert.assertEquals(cartId, null);
	}
	
	
	@Test
	public void contextLoads() {
		String test = " ";
		Assert.assertEquals(test, " ");
	}
	
	@Test
	public void contextLoads1() {
		String test = " ";
		Assert.assertEquals(test, " ");
	}
	
	@AfterMethod
	public void afterMethod() {
		
	}
	

}
