package com.kiranacademy.Array;



import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample5 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many objects you want to store ?  ");
		int size=scanner.nextInt();
		
		Student[] students= new Student[size];
						                              //            0     1     2
		System.out.println(Arrays.toString(students));// students [null][null][null]
				
		//System.out.println(students[0].marks);
		
		int rno,marks;
		
		for(int index=0;index<students.length;index++)
		{
			System.out.println("Enter rno and marks :-  ");
			rno=scanner.nextInt();//3
			marks=scanner.nextInt();//70
		
			students[index]=new Student(rno,marks);// creating object and then storing it in an array at particular index
			
		}
		
		// students [1,70][2,80][3,60]
		int max=0;//80
		for(Student student:students)
		{
			if(student.marks> max)
			{
				max=student.marks;
				
			}
				
		}
		System.out.println(max);
		
	}
}
