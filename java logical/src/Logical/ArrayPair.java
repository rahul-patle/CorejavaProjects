package Logical;

public class ArrayPair {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

			for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] == (a[i] * a[i])) {
					System.out.println("Squares :- " + a[i] + "=>" + a[j]);
				}
				if (a[j] == (a[i] * a[i] * a[i])) {
					System.out.println("Cubes :- " + a[i] + "=>" + a[j]);
				}
			}
		}
	}
}
