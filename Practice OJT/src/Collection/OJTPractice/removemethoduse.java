package Collection.OJTPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class removemethoduse {

	public static void main(String[] args) {

		TreeSet<Employee> treeset = new TreeSet<>(new TestEmployeeName() );
		treeset.add(new Employee(1, "C", 30));
		treeset.add(new Employee(3, "B", 36));
		treeset.add(new Employee(2, "D", 25));

		Iterator<Employee> itr = treeset.iterator();
		while (itr.hasNext()) {
			Employee no = itr.next();
			
			if (no.equals(new Employee(1, "Argon", 30))) 
			itr.remove();
			
		}	
		System.out.println(treeset);
			
			
			
		

	}
}