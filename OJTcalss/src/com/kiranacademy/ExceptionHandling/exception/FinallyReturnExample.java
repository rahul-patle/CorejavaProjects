package com.kiranacademy.ExceptionHandling.exception;

public class FinallyReturnExample {

	public static void main(String[] args) {
		
		int a=10;
		
		try
		{
			System.out.println("Hello");
			//return;   // finally will execute even after return statement execution
			System.exit(0);
		}
		
		catch(Exception e)
		{
			return;
				
		}
		
		finally
		{
		
			System.out.println("finally");
		}
	}
}
