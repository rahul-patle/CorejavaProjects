package com.kiranacademy.ExceptionHandling.exception;

// unchecked exception extends RuntimeException class. 
// throw is used to generate exception explicitly
// throws is used to delegate exception handling responsibility to caller

public class AgeNotValidException extends Exception 
{
	int waitingYears;// non-static variable / instance variable 
	
	// new AgeNotValidException(18-age);
	
	public AgeNotValidException(int waitingYears) 
	{
		this.waitingYears =waitingYears;
	}

	
}
