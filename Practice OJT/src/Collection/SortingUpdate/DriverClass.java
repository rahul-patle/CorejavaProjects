package Collection.SortingUpdate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


public class DriverClass {
	public static void main(String[] args) {
// Sorting by pid and price
// comparable is use for sigle element. (lang)Package
// comarator is use for multiple element.(util)	Package	
		Scanner scanner = new Scanner(System.in);

		TreeSet<Product> treeSet = new TreeSet<Product>(new MyCompaByPrice ());
		treeSet.add(new Product(1, "biscuit", 50000));
		treeSet.add(new Product(2, "calculator", 500));
		treeSet.add(new Product(3, "bat", 500));
		treeSet.add(new Product(4, "pettrydish", 1000));

		
//=>notapplicable for Treeset//	Collections.sort(treeSet, new MyCompaByPrice ());
		System.out.println(treeSet);

	}
}