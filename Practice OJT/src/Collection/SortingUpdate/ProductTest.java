package Collection.SortingUpdate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		
		ArrayList<Product> arraylist = new ArrayList<Product>();
		arraylist.add(new Product (1,"biscuit",100));
		arraylist.add(new Product (2,"calculator",500));
		arraylist.add(new Product (3,"bat",500));
		arraylist.add(new Product (4,"pettrydish",1000));
	
	System.out.println("to update element enter:");
	System.out.println("enter pid");	
	Integer pid =	scanner.nextInt();
	
	System.out.println("enter pname");	
	String pname =	scanner.next();
		
	System.out.println("enter price");	
	Integer price =	scanner.nextInt();
		
		
		Iterator<Product> iter = arraylist.iterator();
		while (iter.hasNext()) {
			Product product = iter.next();
			if (product.pid.equals(pid)) {
				
				product.pname=pname;
				product.price=price;
			}
		}
		System.out.println("updated arraylist");
		System.out.println(arraylist);
	}
}
