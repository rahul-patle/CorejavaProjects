package com.kiranacademy.basicsex27_07;

public class TestBook {

	public static void main(String[] args) {
		
		Book book=new Book();  // book ===> [price=0, name=null] Book class object
		
		System.out.println(book); // toString() is called automatically
		
		//book.price=-200;
		//book.name="Java complete reference";
		
		book.setPrice(-120);
		book.setName("Java Complete reference");
		
		// setter methods are used to update values present in object
		
		System.out.println(book);
		
		// toString() gives content of object .
		// toString() is called automatically whenever we print reference or object .
		
		
		book.setPrice(120);
		System.out.println(book.getPrice());
		System.out.println(book.getName());
		
	}

}
