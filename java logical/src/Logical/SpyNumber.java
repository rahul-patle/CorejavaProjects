package com.ankush.Logical;

import java.util.Scanner;

public class SpyNumber {

	// SpyNumber => Eg=> 1124=> 1+1+2+4=8 & 1*1*2*4=8 if such condition is true then SpyNumber

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int num = sc.nextInt();

		int sum = 0;
		int mult = 1;

		while (num > 0) {
			sum = sum + num % 10;
			mult = mult * num % 10;
			num = num / 10;
		}
		if (sum == mult) {
			System.out.println("Is a SpyNumber");
		} else {
			System.out.println("Is not a SpyNumber");
		}
	}
}
