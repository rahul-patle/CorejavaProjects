package com.kiranacademy.Collection.sorting;

import java.util.Comparator;

public class Sortonprice implements Comparator<Product> 
{

	@Override
	public int compare(Product p1, Product p2) 
	{
	
		return p1.price.compareTo(p2.price);
	}
	

}
