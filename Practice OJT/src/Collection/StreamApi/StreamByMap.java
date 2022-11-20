package Collection.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamByMap {
// map is use to update the element
	
	public static void main(String[] args) {
		List<Product> list =Arrays.asList(new Product(1," bat",2500),new Product(2," ball",3000),new Product(3," lapi",6000));
		Stream <Product>stream = list.stream();
	     stream=stream.map(product->{
	product.setPrice(product.price-600);
	return product; });
		
	     stream.forEach(product->System.out.println(product));
	}
	
}
