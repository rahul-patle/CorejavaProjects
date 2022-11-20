package com.kiranacademy.Streamspi2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AvgEx {

	public static void main(String[] args) {
		
		List<Products> list=Arrays.asList(new Products(1,3000,"mouse"),new Products(2,2000,"pen"),new Products(3,1000,"bat"));
		
		Stream<Products> stream = list.stream();
		
// gives object of stream which contains integer object
//the map() is used to transform one object into other by applying a function.  
//That's why the Stream map(Function mapper) takes a function as an argument.		
		Stream<Integer> stream2=stream.map(product->product.price);
		
		// reduce() gives object of optional which cotain integer object
		Optional<Integer> optional=stream2.reduce((price1,price2)->price1+price2);
		
		System.out.println(optional);
		
		long count=list.stream().count();
		
		int sum=optional.get();
		
		long avgerage=sum/count;
		
		System.out.println("sum is " + sum + " and count is " + count);
		
		System.out.println(avgerage);
		
	}
}
