package com.kiranacademy.Collection.sorting;

import java.util.Comparator;

public class SortOnSalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) 
	{
		if(e1.salary.equals(e2.salary))
		{
			return e1.ename.compareTo(e2.ename);
		}
		else
		return e1.salary.compareTo(e2.salary);
	}

	
	
}
