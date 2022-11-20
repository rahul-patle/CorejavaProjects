package Collection.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ByDistinct {

	public static void main(String[] args) {
	List <Product> list =	Arrays.asList(new Product (4,"shiva",60000), 
			new Product (3,"rama",60000),new Product (2,"shiva",200000),
			new Product (1,"arjuna",15000));
	
	Stream <Product> stream=list.stream();
	
	stream.map((product)->(product))
	.distinct()
	
	.forEach((product)->System.out.println(" distict pro.price: "+product));
	
	
	}

}
