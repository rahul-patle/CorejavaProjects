package Collection.OJTPractice;

import java.util.ArrayList;
import java.util.TreeSet;

public class EmployeeTest {
	// by using comparable
	public static void main(String[] args) {

// 1//
		ArrayList<Employee> arraylist = new ArrayList<Employee>();

		arraylist.add(new Employee(2, "shyam", 25));
		arraylist.add(new Employee(3, "Ram", 36));
		arraylist.add(new Employee(1, "nilgiri", 26));

// by passing reference instead of object		
		Employee e = new Employee (1,"tri",30);
		arraylist.add(e);
		System.out.println(arraylist);
		
//one way	
/* ==> for generic 	*/	Employee p = arraylist.get(1);
		        System.out.println(p.eid);
		        
		        
// another way    
/* ==> for non generic 	*/	Employee p2 = (Employee)arraylist.get(1);
// need type casting	       
			
		
		
		
		System.out.println("adding object to treeset");

		
// 2//
		// TreeSet<Employee> set = new TreeSet<>(arraylist);
		// System.out.println(set);
// 3//

		// TreeSet<Employee> set2 = new TreeSet<>();
		// set2.addAll(arraylist);
		// System.out.println(set2);

	}
}