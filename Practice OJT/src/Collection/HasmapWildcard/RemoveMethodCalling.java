package Collection.HasmapWildcard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveMethodCalling {

	public static void main(String[] args) {

			
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		
		Iterator<Integer> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			
				Integer i= iterator.next();
				if (i == 3)
				iterator.remove();
				arraylist.remove(i);
		}
		System.out.println(arraylist);

	}
}
