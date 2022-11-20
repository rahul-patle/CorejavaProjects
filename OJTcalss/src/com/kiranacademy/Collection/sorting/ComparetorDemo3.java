package com.kiranacademy.Collection.sorting;

import java.util.Scanner;
import java.util.TreeSet;


public class ComparetorDemo3 {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
while(true)
{
		System.out.println("1. sort on eno  2.sort on salary 3.exit");
		System.out.println("Enter your choice:-  ");
		int choice=scanner.nextInt();
		
		TreeSet<Employee> treeset=null;
		
		if(choice==1) 
		{
			treeset= new TreeSet<>(new SortOnEno());
		}
		else if(choice==2)
		{
			treeset=new TreeSet<>(new SortOnSalary());
		}
		else
		{
			System.exit(0);
		}
		
		treeset.add(new Employee(3, 4000, "akshay"));
		treeset.add(new Employee(2, 4000, "Bala"));
		treeset.add(new Employee(1, 5000, "Chetan"));
				
		System.out.println(treeset);
	
}
	
	/*
	 * comparable is used for single sorting sequence
	 * 
	 * comparator is used for multiple sorting sequence
	 * 
	 *  */

	}

}
