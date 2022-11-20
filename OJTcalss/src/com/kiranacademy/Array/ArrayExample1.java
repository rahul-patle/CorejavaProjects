package com.kiranacademy.Array;


import java.util.Arrays;

public class ArrayExample1 {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30};
	
		System.out.println(a);
		
		System.out.println(Arrays.toString(a));
		
		
		System.out.println(a[0]);
		
		for(int element : a)
		{
			System.out.println(element);
		}
		
	}
}
