package Collection.JDK8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

import Collection.SortingUpdate.Product;

public class Lamdaex3 {

	public static void main(String[] args) {

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(5, "AAA", 50000));
		arrayList.add(new Employee(6, "BBB", 500));
		arrayList.add(new Employee(3, "CCC", 300));
		arrayList.add(new Employee(4, "DDD", 1000));

		// Collections.sort(arrayList, new MyCompaByPrice() );
		Collections.sort(arrayList, (p1, p2) -> (p1.salary.compareTo(p2.salary)));
		System.out.println(arrayList);
		
	}
}
