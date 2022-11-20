package com.kiranacademy.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample4 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many objects you want to store ?  ");
		int size=scanner.nextInt();
		
		Student[] students= new Student[size];
						                              //            0     1     2
		System.out.println(Arrays.toString(students));// students [null][null][null]
				
		System.out.println(students[0].marks);
		
		int rno,marks;
		
		
		
		
		
		
		
		
		
		
		
		for(int index=0;index<students.length;index++)
		{
			System.out.println("Enter rno and marks :-  ");
			rno=scanner.nextInt();//3
			marks=scanner.nextInt();//70
		
			students[index]=new Student(rno,marks);// creating object and then storing it in an array at particular index
			
		}
		System.out.println(Arrays.toString(students));// prints contents of array
		
		
	}
}
