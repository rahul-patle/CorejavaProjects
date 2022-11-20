package com.kiranacademy.basicsex26_07;

public class TestVariables2 {

	int a;
	static int b;
	boolean isFound;
	
	public static void main(String[] args) 
	{
		System.out.println(b);
		
		System.out.println(new TestVariables2().a);// using object

		TestVariables2 obj=new TestVariables2();
		System.out.println(obj.isFound);
		
		System.out.println(obj.a);// using reference obj
		
		/* inside static context , non-static variables should be accessed using object or object reference */
		
	}// main ends
	

	
}
