package com.kiranacademy.Streamspi2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxEx2 {

	public static void main(String[] args) {
		
		List<Products> list=Arrays.asList(new Products(1,3000,"mouse"),new Products(2,2000,"pen"),new Products(3,1000,"bat"));
		
		Stream<Products> stream = list.stream();
		
		Optional<Products> optional=stream.max((product1,product2)->product1.price.compareTo(product2.price));
		
		if(optional.isPresent())
			System.out.println(optional.get());
		
		// compare(no1,no2)
	}
}
