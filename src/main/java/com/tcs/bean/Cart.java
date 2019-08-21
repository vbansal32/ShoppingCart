package com.tcs.bean;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private String cartId;
	private List<Item> cartItems = new ArrayList<Item>();
	private int itemCount;
	private double cartAmount;
	private String address;
	private List<String> coupons;
	
	public Cart() {
		super();
	}

	public Cart(String cartId, List<Item> cartItems, int itemCount, double cartAmount, String address,
			List<String> coupons) {
		super();
		this.cartId = cartId;
		this.cartItems = cartItems;
		this.itemCount = itemCount;
		this.cartAmount = cartAmount;
		this.address = address;
		this.coupons = coupons;
	}
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public List<Item> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<Item> cartItems) {
		this.cartItems = cartItems;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public double getCartAmount() {
		return cartAmount;
	}
	public void setCartAmount(double cartAmount) {
		this.cartAmount = cartAmount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<String> coupons) {
		this.coupons = coupons;
	}
	
	@Override
	public String toString() {
		return cartId + " " + cartItems.toString() + " " + itemCount + " " + cartAmount + " " + address + " " + coupons.toString();
	}
}
