package com.kiranacademy.AccessModifier2;

public class B 
{
	public static void main(String[] args) {
		
		new A().method();//<== public method calling
		
		new A().m1(); //<==== if package is same then we can call protected method 
		                      // by parent class object.
		
		//new A().method2(); // private method can be call within the class
		
		new A().method3(); //<== default method calling
		new A().methodsta(); // static method calling
		A.methodsta();  // static method calling
	}						
}
