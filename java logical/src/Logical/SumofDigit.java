package com.ankush.Logical;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int no = scanner.nextInt();
		int temp = no;
		int sum = 0;
		int rem = 0;

		while (temp != 0) {
			rem = temp % 10;//
			sum = sum + rem;
			temp = temp / 10;
		}
		System.out.println("Actual no is :-" + no);
		System.out.println("Sum of Digits is :-" + sum);
	}
}

//25
//1st Condition=> rem=5,temp=2
//2nd Condition=> rem=2,temp=0