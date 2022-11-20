package com.ankush.Logical;

import java.util.Scanner;

public class VowelCheck {

	static int vowelCheck(String word) {

		int count = 0;

		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println("Vowels in Word are =>" + ch);
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the Word =>");
		String word = sc.next();

		int vowelCheck = vowelCheck(word);

		System.out.println("No of Vowels in word are =>" + vowelCheck);
	}
}
