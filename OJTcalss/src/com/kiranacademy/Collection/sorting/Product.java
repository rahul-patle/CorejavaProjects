package com.kiranacademy.Collection.sorting;

public class Product 
{

	Integer pid,price;
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
