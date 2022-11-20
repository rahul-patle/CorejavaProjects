package com.kiranacademy.Collection.sorting;

import java.util.Scanner;
import java.util.TreeSet;


public class ComparetorDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. sort on price  2.sort on name");
		System.out.println("Enter your choice:-  ");
		int choice=scanner.nextInt();
		
		TreeSet<Product> treeset;
		
		if(choice==1) 
		{
			treeset= new TreeSet<>(new Sortonprice());
		}
		else
		{
			treeset=new TreeSet<>(new Sortonname());
		}
		
		treeset.add(new Product(3, 5000, "mouse"));
		treeset.add(new Product(2, 3000, "mouse"));
		treeset.add(new Product(1, 5000, "keyboard"));
				
		System.out.println(treeset);
	
		main(args);
	
	/*
	 * comparable is used for single sorting sequence
	 * 
	 * comparator is used for multiple sorting sequence
	 * 
	 *  */

	}

}
