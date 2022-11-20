package com.ankush.Logical;

import java.util.Scanner;

public class PalindromeNumberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;
		int rem = 0;

		while (temp != 0) {
			rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		if (num == sum) {
			System.out.println(num + " is Palindrome Number");
		} else {
			System.out.println(num + " is not a Palindrome Number ");
		}
	}

}
