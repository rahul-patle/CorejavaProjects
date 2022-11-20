package com.kiranacademy.Collection.streamapiex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapExample1  
{
  public static void main(String[] args) 
  {
	// map is use to update the nnumber 	
	  	Arrays.asList(1,2,3).stream().map(number->number*number).forEach(number->System.out.println(number));;
	  	
  }
}

// interface Predicate
// {
		// boolean test(Object o);
// }
