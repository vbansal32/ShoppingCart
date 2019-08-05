package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tcs")
public class ShoppingCart {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCart.class, args);
	}

}
