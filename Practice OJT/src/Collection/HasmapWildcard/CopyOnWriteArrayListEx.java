package Collection.HasmapWildcard;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList <Integer> arraylist= new 	CopyOnWriteArrayList <>();	
	// CopyOnWriteArrayList is synchronised method;
	// by this arraylist remove method can be use while iterating;
		
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		
		Iterator <Integer> iterator = arraylist.iterator();
		
		while(iterator.hasNext()) {
			Integer  i = iterator.next();
			if (i==30) {
			//	iterator.remove();
				arraylist.remove(i);
			}
		}System.out.println(arraylist);
	}
	
}
