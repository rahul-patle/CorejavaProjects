package Inheritance;

public class BigBasketTest {

	public static Object check(String name) {

		if (name.equals("Bigbasket"))

			return new Bigbasket(11, 22);

		else if (name.equals("String"))
			return "java";

		else
			return null;

	}

	public static void main(String[] args) {
		Bigbasket bigbasket = (Bigbasket) check("Bigbasket");
		System.out.println(bigbasket.toString());

		String string = (String) check("String");

		string.charAt(2);

		System.out.println(string.charAt(2));
		string.toString();
		System.out.println(string.toString());

	}

}
