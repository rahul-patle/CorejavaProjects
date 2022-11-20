package com.ankush.Logical;

public class PrimeNumberEx {

	public static void main(String[] args) {

		for (int no = 3; no <= 300; no++) {
			int i;
			for (i = 2; i < no; i++) {

				if (no % i == 0) {
					// System.out.println(no + " is ODD Number");
					break;
				}
			}

			if (no == i) {
				System.out.println(no);
			}
		}
		boolean prime = isPrime(5);
		System.err.println(prime);
	}

	static boolean isPrime(int no) {

		if (no == 1)
			return false;

		boolean answer = false;

		for (int i = 2; i < no; i++) {
			if (no % i != 0) {
				answer = true;
				break;
			}
		}
		return answer;
	}

}
