package com.kiranacademy.Array.assignment;

import java.util.Scanner;

public class ReadInput2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/* while using nextLine() , read String value first */

		System.out.println("Enter name :- ");
		String name=scanner.nextLine(); 
		
		System.out.println("Enter rno :- ");
		int rno=scanner.nextInt();              
		
		
		System.out.println(rno +" " + name);
	
	
	}
}
