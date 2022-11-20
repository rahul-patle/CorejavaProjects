package com.kiranacademy.Collection.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
//2) way to update

public class ArrayListUpdate2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Employee> arrayList = new ArrayList<Employee>();

		arrayList.add(new Employee(3, 4000, "akshay"));
		arrayList.add(new Employee(2, 4000, "Bala"));
		arrayList.add(new Employee(1, 5000, "Chetan"));

		System.out.println("Enter employee number :-  ");
		int eno = scanner.nextInt();

		System.out.println("Enter new name :-  ");
		String ename = scanner.next();

		System.out.println("Enter new salary :-  ");
		int salary = scanner.nextInt();

		for (int index = 0; index < arrayList.size(); index++) {
// we are taking reference of type employee to call variable	
			Employee employee = arrayList.get(index);

// input eno is equal to object content eno then
// at particular index content will be updated			
			if (employee.eno.equals(eno)) {
				arrayList.set(index, new Employee(eno, salary, ename));
	

			}
		}

		System.out.println("ArrayList after removal :-  ");
		System.out.println(arrayList);

		/*
		 * comparable is used for single sorting sequence
		 * 
		 * comparator is used for multiple sorting sequence
		 * 
		 */

	}

}
