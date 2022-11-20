package com.ankush.Logical;

public class PrimeandOddFactorsEx {

	public static void main(String[] args) {

		int no = 12;

		for (int i = 1; i <= 12; i++) {
			if (no % i == 0) {
				System.out.println(" Factors Are => " + i);
				if (PrimeNumberEx.isPrime(i)) {
					System.out.println(" Prime Factors Are => " + i);
				} else {
					System.err.println(" Odd Factors Are => " + i);
				}
			}

		}
	}
}
