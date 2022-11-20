package com.kiranacademy.basicsex27_07;

public class Book 
{
	private int price;
	private String name;
		
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) 
	{
		if(price>0)
			this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// toString() gives content of object.
	// toString() is called automatically whenever we print reference or object.
	
	public String toString() {
		return "Book [price=" + price + ", name=" + name + "]";
	}
	
	
	
}
