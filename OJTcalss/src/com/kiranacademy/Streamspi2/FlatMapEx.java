package com.kiranacademy.Streamspi2;

import java.util.Arrays;
import java.util.List;

import javax.lang.model.element.Element;

public class FlatMapEx {

	
	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(1,2,3);
		List<Integer> list2=Arrays.asList(4,5,6);
		List<Integer> list3=Arrays.asList(7,8,9);
		
		List<List<Integer>> listoflist=Arrays.asList(list1,list2,list3);
// flatmap is use for  joining multiple list	
// flatmap  converts list of list into list *		
		
		listoflist.stream().flatMap(list->list.stream()).forEach(element->System.out.println(element));
		

		
	}
	
}
