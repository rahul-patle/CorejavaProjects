package com.kiranacademy.Collection.streamapiex;

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

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	// Product p1=new Product(1,3000,"mouse");
	// Product p2=new Product(2,2000,"keyboard");
	// p1.compareTo(p2); TreeSet will call it

	
}
