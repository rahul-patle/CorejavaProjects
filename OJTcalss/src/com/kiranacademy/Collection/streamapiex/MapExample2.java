package com.kiranacademy.Collection.streamapiex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapExample2  
{
  public static void main(String[] args) 
  {
	 	
	  Arrays.asList(new Product(1,3000,"mouse"),new Product(2,2000,"pen"),new Product(3,1000,"bat")).stream().map((product)->
	  
	  {
		  product.setPrice(product.price-500);
		  return product;
	  }).forEach(product->System.out.println(product));	  	
  }
}

// interface Predicate
// {
		// boolean test(Object o);
// }
