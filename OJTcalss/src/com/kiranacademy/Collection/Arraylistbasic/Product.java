package com.kiranacademy.Collection.Arraylistbasic;

public class Product {

	int pid,price;
	String name;
	
	public Product(int pid, int price, String name) {
		super();
		this.pid = pid;
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", name=" + name + "]";
	}
	
	
	
}
