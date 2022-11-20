package com.kiranacademy.ExceptionHandling.exception;

public class ThrowsDemo {
	
// throws indicates caller of m1() should handle exception
// throws is used to delegate exception handling responsibility to caller of method
	
	static void m1(String a) throws NumberFormatException
	{
			
			System.out.println(Integer.parseInt(a));
	}
	
	public static void main(String[] args)  {
		
		
		m1("ttt"); // NumberFormatException is unchecked exception
				
		System.out.println("All is well");
		
	}

}
