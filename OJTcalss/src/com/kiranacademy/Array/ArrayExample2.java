package com.kiranacademy.Array;

import java.util.Arrays;

public class ArrayExample2 {
	// ways to iterate
	public static void main(String[] args) {
	
		String[] strings= {new String("java"),new String("is"),new String("easy")};
		
		for(String string : strings)
		{
			System.out.println(string);
		}
		
		
		for(int index=0;index<strings.length;index++)
		{
			System.out.println(strings[index]);
		}
		
	}
}
