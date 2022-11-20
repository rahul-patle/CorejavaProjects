package wownprograms.logicalpratice;

import java.util.Arrays;

public class Simpleclass {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8
		int temp = 0;
		int[] a = { 3, 6, 73, 6, 9, 7, 5, 2, 8 };
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			System.out.println(a[i]);

		}

	}
}
