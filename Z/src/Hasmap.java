import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hasmap {
	/**
	 * Hashmap can be iterate by for each by iterator	  
	 */

	public static void main(String[] args) {

		HashMap<String, Long> hashmap = new HashMap<String, Long>();

		hashmap.put("akshay", 123L);
		hashmap.put("sachin", 124L);
		hashmap.put("rajesh", 125L);

		System.out.println(hashmap);

		Set<String> set = hashmap.keySet();// set===>[akshay,sachin,rajesh] Set object

		for (String name : set) {
			System.out.println(name + " " + hashmap.get(name));
		}

		// iterator ==> [hashNext(),next(),remove()] Iterator object

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s + hashmap.get(s));
			
		}

		List<Integer> al = Arrays.asList(1, 2, 3, 4);

		Integer i = (Integer) al.get(0);
		System.out.println(i);
	}
}
