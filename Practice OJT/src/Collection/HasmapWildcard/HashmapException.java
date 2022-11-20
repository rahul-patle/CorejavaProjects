package Collection.HasmapWildcard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashmapException {

	public static void main(String[] args) {

	ConcurrentHashMap<Integer, Integer>  hashmap =new ConcurrentHashMap<Integer, Integer>();
	//HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		hashmap.put(1, 30);
		hashmap.put(2, 40);
		hashmap.put(3, 50);
		int i = 10;
		
	//	Set<Entry<Integer, Integer>> set= hashmap.entrySet();
	//	Iterator<Entry<Integer, Integer>> iterator = set.iterator();
	//	while (iterator.hasNext()) {
			 // }
	
//  for each method to update the value
	for (Entry entry : hashmap.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
			hashmap.put(3,i=i+1);

		}System.out.println(hashmap);
		
	}
}