package Collection.JDK8features;

import java.util.ArrayList;
import java.util.Collections;

import Collection.SortingUpdate.MyCompaByPrice;
import Collection.SortingUpdate.Product;

public class Lamdaex2 {

	public static void main(String[] args) {

		ArrayList<Product> arrayList = new ArrayList<Product>();
		arrayList.add(new Product(5, "biscuit", 50000));
		arrayList.add(new Product(6, "calculator", 500));
		arrayList.add(new Product(3, "bat", 300));
		arrayList.add(new Product(4, "pettrydish", 1000));

		//Collections.sort(arrayList, new MyCompaByPrice() );
		Collections.sort(arrayList,(p1,p2)->(p1.compareTo(p2)));
	    System.out.println(arrayList);
	}
}
