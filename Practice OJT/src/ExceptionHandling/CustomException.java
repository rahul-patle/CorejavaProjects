package ExceptionHandling;

import java.util.Scanner;

public class CustomException {

	public static void method1(int age) throws AgenotValidException {
		if (age < 18)
			throw new AgenotValidException(+18 - age);

		else
			System.out.println("you can vote");
	}
	public static void main(String[] args) {
		try {
			method1(17);

		} catch (AgenotValidException e) {

			e.printStackTrace();
			System.out.println(e.waiting);
		}
			finally {
				System.out.println("wish you good luck,");
		}
	}
}
