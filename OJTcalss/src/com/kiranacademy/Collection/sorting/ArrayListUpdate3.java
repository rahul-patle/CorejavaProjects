package com.kiranacademy.Collection.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

// update for integer

public class ArrayListUpdate3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
	
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		

		for(int index=0;index<arrayList.size();index++)
		{
					
				if(arrayList.get(index).equals(10))
				{
					arrayList.set(index,50);
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
