package Collection.SortingUpdate;

import java.util.Comparator;

public class MyCompaByPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
	// if price same then compare with pid,
	// other wise compare with pid	
		if (p1.price.equals(p2.price)) {
			return p1.pid.compareTo(p2.pid);
		}else
		return p1.price.compareTo(p2.price);
	}

}
