package Collection.HasmapWildcard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IterationWithoutEntry {

	public static void main(String[] args) {

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

		hashmap.put("jkl", 1);
		hashmap.put("lmn", 2);
		hashmap.put("hhhh", 3);

		System.out.println(hashmap);
		hashmap.put("def", 1010);
		hashmap.put("hhhh", 3);

		hashmap.remove("hhhh");

// byforeach method	(With Entry type)
		Set<String> set = hashmap.keySet();
		
		
		for (String keyname : set) {

			System.out.println(keyname + " "+ hashmap.get(keyname) );

		}
	}
}
