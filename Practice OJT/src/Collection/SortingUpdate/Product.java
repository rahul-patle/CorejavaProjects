package Collection.SortingUpdate;

import java.util.Comparator;

public class Product implements Comparable<Product>{

	Integer pid;
	String pname;
	Integer price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer pid, String pname, Integer price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	
	@Override
	public int compareTo(Product o) {
		
	return pid.compareTo(o.pid);
	}
	
	
}
