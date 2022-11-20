package com.kiranacademy.Collection.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// two ways to update
// 1) way to update the elements by taking input

public class ArrayListUpdate {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Employee> arrayList=new ArrayList<Employee>();
	
		arrayList.add(new Employee(3, 4000, "akshay"));
		arrayList.add(new Employee(2, 4000, "Bala"));
		arrayList.add(new Employee(1, 5000, "Chetan"));
				
		System.out.println("Enter employee number :-  ");
		int eno=scanner.nextInt();

		System.out.println("Enter new name :-  ");
		String name=scanner.next();
		
		System.out.println("Enter new salary :-  ");
		int salary=scanner.nextInt();

//treeset.iterator().next();

Iterator<Employee> iterator=arrayList.iterator();

		//  iterator ===> [ hasNext() , next() , remove() ] Iterator object

while(iterator.hasNext())
{
	// creating the reference for checking conditions
		Employee employee = iterator.next();
		
	// when we don't have getter setter method then we use this pattern			
		if(employee.eno.equals(eno))
		{
			employee.ename=name;
			employee.salary=salary;
		}
}
	
System.out.println("ArrayList after removal :-  ");
System.out.println(arrayList);

/*
	 * comparable is used for single sorting sequence
	 * 
	 * comparator is used for multiple sorting sequence
	 * 
	 *  */

	}

}
