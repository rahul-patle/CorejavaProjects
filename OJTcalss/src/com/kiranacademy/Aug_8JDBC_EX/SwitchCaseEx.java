package com.kiranacademy.Aug_8JDBC_EX;

import java.util.Scanner;

public class SwitchCaseEx {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number :- ");
		int no=scanner.nextInt();
		
		int result=0;
		
		while(true)
		{
			System.out.println("1.square 2.cube 3.exit");
			
			System.out.println("Enter your choice :-  ");
			
			int choice=scanner.nextInt();
			
			switch(choice)
			{
				case 1:
					
					result=no*no;
					break;
					
				case 2:
					
					result=no*no*no;
					break;
				
				case 3:
					
					System.exit(0);
					
				default:
					
					System.out.println("please enter 1/2/3 only");
				
			}// switch case ends
			
			System.out.println(" result is  " + result);
			
		}// while loop ends
		
		
		
	}//main ends

}//class ends
