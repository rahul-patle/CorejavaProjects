package com.ankush.Logical;

import java.util.Scanner;

public class PalindromeEx {

	// Palimdrome Strings are those strings whose reverseString and originalString
	// are Same.
	// EX => POP,MOM,LOL

	static String isPalindrome(String originalString) {

		StringBuffer sb = new StringBuffer(originalString);

		sb.reverse();
		String reverseString = sb.toString();

		if (originalString.equals(reverseString)) {
			return "It is Palindrome String ";
		} else {
			return "It is not Palindrome String";
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :- ");
		String originalString = sc.next();

		String palindrome = isPalindrome(originalString);

		System.out.println(palindrome);
		main(args);
	}
}
