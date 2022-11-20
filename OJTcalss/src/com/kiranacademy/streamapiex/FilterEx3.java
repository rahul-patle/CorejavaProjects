package com.kiranacademy.streamapiex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterEx3  
{
  public static void main(String[] args) {
	 	
	 																												
	  	Arrays.asList(new Product(1,3000,"mouse"),new Product(2,2000,"pen"),new Product(3,1000,"bat")).stream().filter((product)->product.price>1500 && product.pid>1).forEach(product->System.out.println(product));
	  	
  }
}

// interface Predicate
// {
		// boolean test(Object o);
// }
