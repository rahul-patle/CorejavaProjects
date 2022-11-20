package com.kiranacademy.Collection.sorting;

import java.util.TreeSet;


public class ComparetorDemo {

	public static void main(String[] args) {
		
	TreeSet<Product> treeset = new TreeSet<>(new Sortonprice());

	treeset.add(new Product(3, 5000, "mouse"));
	treeset.add(new Product(2, 3000, "pen"));
	treeset.add(new Product(1, 6000, "keyboard"));
	
	System.out.println(treeset);
	
	TreeSet<Product> treeset2=new TreeSet<>(new Sortonname());
	treeset2.addAll(treeset);
	System.out.println(treeset2);
	
	/*
	 * comparable is used for single sorting sequence
	 * 
	 * comparator is used for multiple sorting sequence
	 * 
	 *  */

	}

}
