package wownprograms;

public class ssss {
	// Java Program to illustrate the use of break statement
	// inside an inner loop

	public static void main(String[] args) {
		// outer loop
		for (int i = 1; i <= 3; i++) {
			// inner loop
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					// using break statement inside the inner loop
//when we apply beak; then inner loop will terminate from that point	
// outer loop start again with increament
					break;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
