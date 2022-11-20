package com.kiranacademy.polymorphism_1_2_Aug;

public class Base {

	private void m1()
	{
		System.out.println("child method");
	}
	
	final void m2()
	{
		System.out.println("I am final");
	}
	
	static void m3()
	{
		System.out.println("Base method");
	}
	
	void m4()
	{
		System.out.println("Base method");
	}
	
}

// final class can not have child class

//class A extends String
//{
//	
//}