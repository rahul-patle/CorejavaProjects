package Collection.SortingUpdate;

import java.util.ArrayList;
import java.util.Collections;

public class DriverClass2 {

	public static void main(String[] args) {

		ArrayList<Product> arrayList = new ArrayList<Product>();
		arrayList.add(new Product(1, "biscuit", 50000));
		arrayList.add(new Product(2, "calculator", 500));
		arrayList.add(new Product(3, "bat", 500));
		arrayList.add(new Product(4, "pettrydish", 1000));
		System.out.println("before sort");
		System.out.println(arrayList);

// sort is applicable for ,which don't allow internally sorting.		
		Collections.sort(arrayList, new MyCompaByPrice());
		
		System.out.println("after sort");
		System.out.println(arrayList);

	}
}