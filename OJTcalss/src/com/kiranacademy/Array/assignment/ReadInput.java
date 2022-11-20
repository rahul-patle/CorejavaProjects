package com.kiranacademy.Array.assignment;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rno :- ");
		int rno=scanner.nextInt();
		
		System.out.println("Enter name :- ");
		scanner.nextLine();// this will read enter key  
		
		String name=scanner.nextLine();
		
		System.out.println(rno + " " + name);
	}
}
