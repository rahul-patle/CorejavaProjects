package Collection.OJTPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Integermethod {

	public static void main(String[] args) {

		ArrayList<Integer> arraylist = new ArrayList<>();

		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(40);
		arraylist.add(30);

		System.out.println(arraylist);
		Iterator<Integer> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Integer object = iterator.next();
			if (object.equals(10))
				
			iterator.remove();

		}
		System.out.println(arraylist);

	}
}
