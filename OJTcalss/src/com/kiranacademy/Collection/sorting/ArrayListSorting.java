package com.kiranacademy.Collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListSorting {

	public static void main(String[] args) {
				
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(15);
		arrayList.add(20);
		
		TreeSet<Integer> treeset = new TreeSet(arrayList);
		
		System.out.println(treeset);// sorted arrayList but remove duplicates from ArrayList
		
		Collections.sort(arrayList);// sorted arrayList and also retained duplicates
		
		System.out.println(arrayList);
		
		//arrayList.remove(10);
		//arrayList.remove(new Integer(10));
		
		System.out.println(arrayList);
	
		arrayList.set(2, 50);// set is used to update(replace) element
		
		System.out.println(arrayList);
	
		System.out.println(arrayList.get(2));
		
		Iterator<Integer> iterator=arrayList.iterator();
		
	//   iterator ===> [ next() nextInt(),remove() ] Iterator object
	
		while(iterator.hasNext())
		{
			Integer no=iterator.next();
			
			if(no.equals(10))
				iterator.remove();// it should be used while iterating elements
				//arrayList.remove(no);
			
		}
		
		System.out.println(arrayList);
	}

}
