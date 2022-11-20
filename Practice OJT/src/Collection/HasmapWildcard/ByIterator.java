package Collection.HasmapWildcard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ByIterator {

	public static void main(String[] args) {

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("abc", 1);
		hashmap.put("def", 2);
		hashmap.put("sachin",3);

		System.out.println(hashmap);
		hashmap.put("def", 1010);
		hashmap.put("sachin", 3);

		hashmap.remove("sachin");

// byforeach method	(With Entry type)
		Set<Entry<String, Integer>> set = hashmap.entrySet();
	//	for (Entry<String, Integer> entry : set) {

	//		System.out.println(entry.getKey() + " " + entry.getValue());

		//}

//by iterator		
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
	}
}
