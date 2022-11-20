package Collection.OJTPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorRemoveMethod2 {

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<>();

		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");

		System.out.println(arraylist);
		Iterator<String> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			String object = iterator.next();
			if (object.equals("C"))
				
			iterator.remove();

		}
		System.out.println(arraylist);

	}
}
