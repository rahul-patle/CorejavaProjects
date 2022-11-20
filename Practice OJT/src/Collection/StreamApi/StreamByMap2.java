package Collection.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamByMap2 {

	public static void main(String[] args) {
	
// for single method no reference needed	
	// map() from stream gives stream object.
		
		Arrays.asList(new Product(1,"bat",2500),new Product(2,"ball",3000),new Product(3,"lapi",6000)).stream().map(product->{
	product.setPrice(product.price-600);
	return product; }).forEach(product->System.out.println(product));

	Arrays.asList(new Product(1,"bat",2500),new Product(2,"ball",3000),new Product(3,"lapi",6000)).stream().map(product->{
	product.setPrice(product.price/2);
	return product; }).forEach(product->System.out.println(product));


	Arrays.asList(new Product(1,"bat",2500),new Product(2,"ball",3000),new Product(3,"lapi",6000)).stream().map(product->{
	product.setPrice(product.price*2);
	return product; }).forEach(product->System.out.println(product));

	}
	
}
