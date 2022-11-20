package com.ankush.Logical;

import java.util.Scanner;

public class PerfectNumbers {

	// Ex :- 6=>{3,2,1}=>3+2+1=>6
	// Those Numbers who are divisible & addition of that divisible value is equal
	// to the number then it is a Perfect Number
	// 6,28,496,8128 are few Perfect Numbers
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is not a Perfect Number");
		}
	}
}
