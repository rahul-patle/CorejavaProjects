package com.ankush.Logical;

import java.util.Scanner;

public class NumbertoWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int number = sc.nextInt();
		System.out.println("Input :- " + number);
		String result = "";
		int rem;

		while (number > 0) {
			rem = number % 10;
			System.out.println("Rem is " + rem);
			switch (rem) {
			case 0:
				result = "Zero" + result;
				break;
			case 1:
				result = "One" + result;
				break;
			case 2:
				result = "Two" + result;
				break;
			case 3:
				result = "Three" + result;
				break;
			case 4:
				result = "Four" + result;
				break;
			case 5:
				result = "Five" + result;
				break;
			case 6:
				result = "Six" + result;
				break;
			case 7:
				result = "Seven" + result;
				break;
			case 8:
				result = "Eight" + result;
				break;
			case 9:
				result = "Nine" + result;
				break;
			}
			number = number / 10;
			System.out.println("Number is " + number);
		}
		System.out.println("Output :- " + result);
	}
}
