package Collection.arrayListex;

public class Product implements Comparable<Product>
{

	Integer pid,price;
	String name;
	
	public Product(int pid, int price, String name) {
		super();
		this.pid = pid;
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", name=" + name + "]";
	}

	// Product p1=new Product(1,3000,"mouse");
	// Product p2=new Product(2,2000,"keyboard");
	// p1.compareTo(p2); TreeSet will call it
	
	@Override
	public int compareTo(Product product) 
	{
			return price.compareTo(product.price);
	}
	
	
	
}
