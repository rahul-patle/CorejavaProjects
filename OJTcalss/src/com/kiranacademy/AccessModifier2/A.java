package com.kiranacademy.AccessModifier2;

public class A 
{
	public void method () {
		System.out.println(" i am in public access");
	}
	public static void methodsta () {
		System.out.println(" i am in static access");
	}
	
	protected  void m1()
	{
		System.out.println("A protected method");
	}
	private  void method2()
	{
		System.out.println("i am private method");
	}

	  void method3()
	{
		System.out.println("i am default method");
	}

}



