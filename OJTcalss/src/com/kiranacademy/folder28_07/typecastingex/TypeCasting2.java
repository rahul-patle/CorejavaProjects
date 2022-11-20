package com.kiranacademy.folder28_07.typecastingex;

import java.util.ArrayList;

public class TypeCasting2 
{
	static Object m1(String name)
	{
		if(name.equals("Employee"))
			return new Employee(1,100000);
		
		else if(name.equals("String"))
			return new String("java");
		
		else
			return null;
	}
	
	public static void main(String[] args) {

		Employee employee=(Employee) m1("Employee"); 
		
		// employee==>[eno=1 salary=100000 toString()] Employee class object
		
		System.out.println(employee.toString());
	
		String s=(String) m1("String"); //s==> [java length()] String class object
		s.length();
				
	}
	
}
