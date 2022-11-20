package com.kiranacademy.folder28_07.dynamicdisptachex;

public class B extends A
{
	@Override
	public void m1()
	{
		System.out.println("child class method");
	}
	
	void m2()
	{
		System.out.println("child specific method");
	}
	
	public static void main(String[] args) {
		
		A obj;
		obj=new A();
		obj.m1();// A class's m1() 
		obj=new B();
		obj.m1();// B class's m1()
		//obj.m2();// reference of Parent can not access child specific method
		// or we can write
		A obj1 = new B();
		obj1.m1();
		A a = new B ();
		a.m5();
	}
}
