
public class AmstongNumber {

	public static void main(String[] args) {
		int rem = 0;
		int no = 153;
		int temp = no;
		int rev = 0;

		while (temp != 0) {
			rem = temp % 10;
			temp = temp / 10;
			rev = rev + (rem * rem * rem);
		}
		if (rev == no) {
			System.out.println("number is amsatrong number");
		}
	}
}
