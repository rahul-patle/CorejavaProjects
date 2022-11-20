package Collection.arrayListex;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetEx2 {
	
	public static void main(String[] args) {
		
		
		TreeSet<Product> treeset = new TreeSet<>();
	
		treeset.add(new Product(1, 5000, "mouse"));
		treeset.add(new Product(2, 4000, "keyboard"));
		
		System.out.println(treeset);// treeset sorts objects
		
		
	}

}
