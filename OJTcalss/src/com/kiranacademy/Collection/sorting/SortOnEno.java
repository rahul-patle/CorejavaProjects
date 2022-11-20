package com.kiranacademy.Collection.sorting;

import java.util.Comparator;

public class SortOnEno implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) 
	{
		
		return e1.eno.compareTo(e2.eno);
	}

	
	
}
