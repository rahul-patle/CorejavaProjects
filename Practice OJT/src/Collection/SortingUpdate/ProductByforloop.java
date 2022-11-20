package Collection.SortingUpdate;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductByforloop {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Product> arraylist = new ArrayList<Product>();
		arraylist.add(new Product(1, "biscuit", 100));
		arraylist.add(new Product(2, "calculator", 500));
		arraylist.add(new Product(3, "bat", 500));
		arraylist.add(new Product(4, "pettrydish", 1000));

		System.out.println("to update element enter:");
		System.out.println("enter pid");
		Integer pid = scanner.nextInt();

		System.out.println("enter pname");
		String pname = scanner.next();

		System.out.println("enter price");
		Integer price = scanner.nextInt();

		for (int i = 0; i < arraylist.size(); i++) {

			Product product = arraylist.get(i);
			if (pid.equals(product.pid))
			product = arraylist.set(i,new Product (pid,pname,price));
			
		}System.out.println(arraylist);
	}

}
