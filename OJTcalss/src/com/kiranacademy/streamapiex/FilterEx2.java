package com.kiranacademy.streamapiex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterEx2  
{
  public static void main(String[] args) {
	 	
	 	
	  	Arrays.asList(1,2,3,4,5).stream().filter((number)->number%2==0).forEach(number->System.out.println(number));
	  	
	  	// [ 1,2,3,4,5 filter(),map(),reduce(),max() ] Stream object
	  	  	 	
	  	// [2,4 filter(),map(),reduce(),max() forEach() ] Stream object
	  	
	  	//int len=new String("JBK").concat("java").length();
	  	
	 // 	System.out.println(len);
  }
}

// interface Predicate
// {
		// boolean test(Object o);
// }
