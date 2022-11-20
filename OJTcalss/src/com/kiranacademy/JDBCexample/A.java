package com.kiranacademy.JDBCexample;

public class A {

	static {
		System.out.println("static block of A class ");
		A obj = new A();
		System.out.println("A class object is created " + obj);

	}

}