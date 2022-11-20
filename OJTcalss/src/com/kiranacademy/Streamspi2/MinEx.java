package com.kiranacademy.Streamspi2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinEx {

	public static void main(String[] args) {
		
		List<Products> list=Arrays.asList(new Products(1,3000,"mouse"),new Products(2,2000,"pen"),new Products(3,1000,"bat"));
		
		Stream<Products> stream = list.stream();
		
		Optional<Products> optional=stream.min((products1,products2)->products1.price.compareTo(products2.price));
	// is present method check the object present or not 	
		if(optional.isPresent())
			System.out.println(optional.get());
		
		// compare(no1,no2)
	}
}
