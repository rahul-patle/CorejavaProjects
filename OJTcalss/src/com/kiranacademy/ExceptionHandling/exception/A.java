package com.kiranacademy.ExceptionHandling.exception;

public class A {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);// arithmetic exception
		}
		
		// finally do not handle exception
		
		finally
		{
			System.out.println("i am in finally");
		}
		
		System.out.println("hello");
	}
}
