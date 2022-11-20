package wownprograms.logicalpratice;

public class logical {

	public static void main(String[] args) {
//					0  1  2	 3  4  5  6  7  8  9
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] == a[i] * a[i]) {

					System.out.println(a[i] + " " + a[j]);

				}
			}

		}
	}
}