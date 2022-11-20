package com.kiranacademy.streamapiex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterEx  
{
  public static void main(String[] args) {
	
	  
	  	List<Integer> list=Arrays.asList(1,2,3,4,5);
	  	
	  	Stream<Integer> stream=list.stream();  
	  	
	  	// stream ==> [ 1,2,3,4,5 filter(),map(),reduce(),max() ] Stream object. 	
	  	/*
	  	 *    interface Predicate
	  	 *    {
	  	 *    		boolean test(o);
	  	 *    }
	  	 */
	  	Stream<Integer> stream2=stream.filter((number)->number%2==0);
	  	
	  	List<Integer> newlist =stream2.toList();
	  	System.out.println(newlist);
	  	
	  	
	  	// stream2 === > [2,4] Stream object
	  	
	  	//System.out.println(stream2);
	  
	  	//stream2.forEach(number->System.out.println(number));
	  	
	  	// test(1) , test(2) , test(3) , test(4) , test(5)
	  	// 2,4
	  	
  }
}

// interface Predicate
// {
		// boolean test(Object o);
// }
