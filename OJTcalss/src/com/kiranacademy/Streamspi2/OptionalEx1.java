package com.kiranacademy.Streamspi2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalEx1 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> stream = list.stream();
		
// reduce() gives operation(+,-,/,*) 	
		Optional<Integer> optional=stream.reduce((no1,no2)->no1+no2);
//Nullpointer is checked by using optional method.
// where is present method is used		
		if(optional.isPresent())
			System.out.println(optional.get());
		
		else
			System.out.println("It is empty");
		
	}
}
