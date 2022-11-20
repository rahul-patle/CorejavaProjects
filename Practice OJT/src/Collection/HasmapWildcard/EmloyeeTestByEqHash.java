package Collection.HasmapWildcard;

import java.util.HashMap;

public class EmloyeeTestByEqHash {

	public static void main(String[] args) {
		
	HashMap <Product,String> hashmap = new HashMap <Product,String>(); 
		Product p1 = new Product (1,500,"basket");
		Product p2 = new Product (1,500,"basket");
		Product p3 = new Product (1,600,"HandBag");
		
		hashmap.put(p1, "Big ");
		hashmap.put(p2, "Big ");
		hashmap.put(p3, "small");

// for key=> if equal() return true then hascode are same
// fore key=> if equals ()	return false then hascode is different	
// equal and hashcode get override the for same content hascode is also same
//		
		System.out.println(p1.hashCode()+ " "+ p2.hashCode());
		System.out.println(p1.hashCode()+ " "+ p3.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println(hashmap);
	}
}
