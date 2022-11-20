package Logical;

import java.util.Scanner;

public class FactorialOfNumberEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int no = scanner.nextInt();//3
		
		int fact=1;//here initially one because 
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
