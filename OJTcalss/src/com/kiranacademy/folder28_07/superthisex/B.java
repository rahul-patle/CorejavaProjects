package com.kiranacademy.folder28_07.superthisex;

public class B extends A
{
	int b=20;
	
	void m2()
	{
		m1();
	}
	
	public String toString()
	{
		return "b= " + b + super.toString();
	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.m2();
		System.out.println(obj);
	}
}
