package com.kiranacademy.Inheritance_01;

/*  From child class constructor , default constructor of parent class is called automatically
 * 
 * */
public class A1 {

	 A1()
	{
		System.out.println("default constructor of parent class");
	}
	
	A1(int a)
	{
		
		System.out.println("parameterized constructor of parent class");
	}

}// class A


class B extends A1
{
	B()
	{
	super(20);
	System.out.println("child class constructor");

	}
}
	