package com.kiranacademy.polymorphism_1_2_Aug;

public class AB extends AA
{
// method returning object
	@Override
	String m1()
	{
		return new String("Java");
	}
	
	public static void main(String[] args) 
	{
		
		AA obj = new AB();
		
		String s = (String) obj.m1();
		
		int len = s.length();
		
		System.out.println(len);
		
//The method length() is undefined for the type Object
		
	}
}
