package Collection.arrayListex;

import java.util.HashSet;

public class HashSetEx {
	
	public static void main(String[] args) {
		
		HashSet hashset = new HashSet();
		
		hashset.add(new String("JBK"));
		hashset.add(new Product(1, 1000, "mouse"));
		hashset.add(10);//hashset.add(new Integer(10)) 	
		hashset.add(10);//hashset.add(new Integer(10)) 	
		
		System.out.println(hashset);
		
// [(JBK) String object , (10) Integer object, (10) Integer object, (1,1000,mouse) Product class object   toString() ] 
		                           
								//hashset object
	}

}
