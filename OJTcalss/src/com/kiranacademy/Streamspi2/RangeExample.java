package com.kiranacademy.Streamspi2;

import java.util.stream.IntStream;

/* to print 1-100 numbers without using loops*/

public class RangeExample {

	public static void main(String[] args) {
		
	//IntStream.range(1,101).forEach(System.out::println);
	IntStream.range(1,101).forEach(Integer->System.out.println(Integer));
	}
}
