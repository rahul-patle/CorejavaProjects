package com.kiranacademy.Array;

import java.util.Arrays;

public class ArrayExample3 {
	
	public static void main(String[] args) {
	
		Student[] students= {new Student(1,90),new Student(2,80),new Student(3,70)};
				
		for(Student student : students)
		{
			System.out.println(student);
		}
				
		for(int index=0;index<students.length;index++)
		{
			System.out.println(students[index]);
		}
		
		
		int a=10;
		System.out.println(a++);//10
		System.out.println(a);//11
		System.out.println(++a);//12
		
	}
}
