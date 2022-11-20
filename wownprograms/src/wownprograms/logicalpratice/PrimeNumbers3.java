package wownprograms.logicalpratice;

public class PrimeNumbers3 {

	public static void main(String args[]) {
		int number = 5;
		if (number == 0 || number == 1) {
			System.out.println(number + " number is not prime");
		} else {
			
				int n;
				for (n = 2; n < number; n++) {
					if (number % n == 0) {

						System.out.println(number + "is not prime");
						break;
					}
				}
				if (number == n) {
					System.out.println(number + "is prime");
				}
			}
		}
	}

