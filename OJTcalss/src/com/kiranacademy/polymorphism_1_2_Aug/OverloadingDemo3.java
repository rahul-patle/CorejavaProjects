package com.kiranacademy.polymorphism_1_2_Aug;

/* 
 * char = int
 * byte=short=int=long=float=double 
 * */
public class OverloadingDemo3 {

	public static void getData(Object c)
	{
		System.out.println(" Parent argument " + c);
	}
	
	public static void getData(String c)
	{
		System.out.println(" child argument " + c);
	}
		
	public static void main(String[] args) 
	{
		
		getData(null);// child will get preference
		getData(new String("Java"));
		getData(new Object());
		
	}
}
