package com.kiranacademy.polymorphism_1_2_Aug;

/* 
 * char = int
 * byte=short=int=long=float=double 
 * */
public class OverloadingDemo2 {

	public static void getData(int c)
	{
		System.out.println(" int argument " + c);
	}
	
	public static void getData(float c)
	{
		System.out.println(" float argument " + c);
	}
		
	public static void main(String[] args) 
	{
		
			getData('a');	
			getData(10L);	
			getData(10);
				
		
	}
}
