package Collection.OJTPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorRemoveMethod {

	public static void main(String[] args) {

		ArrayList<Employee> arraylist = new ArrayList<>();

		arraylist.add(new Employee(1, "c", 30));
		arraylist.add(new Employee(3, "b", 36));
		arraylist.add(new Employee(2, "d", 25));

		System.out.println(arraylist);
		Iterator<Employee> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Employee object = iterator.next();
			if (object.equals(new Employee(1, "c", 30)))
				iterator.remove();
// if all values of object smae then it will remove otherwise not.
// so avoid this compare single value
			
			
		}
		System.out.println(arraylist);

	}
}
