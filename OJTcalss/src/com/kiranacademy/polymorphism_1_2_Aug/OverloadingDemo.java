package com.kiranacademy.polymorphism_1_2_Aug;

/*  multiple methods with same name but different argument is overloading 
 *  It is static binding as method call is bound with method definition at compile time based on arguments 
 *  
 * */

public class OverloadingDemo {

	/* method definition */
	
	public static void getData(int pid,String pname,int SSN)
	{
		System.out.println(pid + " " + pname + " " + SSN);
	}
	
	public static void getData(int pid,String pname,long aadharCardNumber)
	{
		System.out.println(pid + " " + pname + " " + aadharCardNumber);
	}
	
	
	public static void main(String[] args) {
		
		getData(101, "manoj",1029090); // method call
		
		getData(102, "sachin",87965L); // method call
	}
}
