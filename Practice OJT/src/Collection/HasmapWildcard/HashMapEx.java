package Collection.HasmapWildcard;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapEx {
	public static void main(String[] args) {

		HashMap<Integer, Employee> hasmap = new HashMap<Integer, Employee>();
		Employee e1 = new Employee(1, 600000, "ame");
		Employee e2 = new Employee(2, 600000, "jkl");
		Employee e3 = new Employee(3, 8000, "mmm");

		hasmap.put(e1.eid, e1);
		hasmap.put(e2.eid, e2);
		hasmap.put(e3.eid, e3);

		System.out.println(hasmap);
		Employee employee = hasmap.get(2);
		employee.setSalary(7000000);

		System.out.println(hasmap);

// Update the value by using collection object
		Collection<Employee> collection = hasmap.values();

		for (Employee emp : collection) {
			if (emp.getEid().equals(3)) {
				emp.setSalary(66000);
				break;
			}
		}
		System.out.println(hasmap);

//	by Treemap fetching the data	

		TreeMap<Integer, Employee> treemap = new TreeMap<Integer, Employee>(hasmap);
		treemap.get(3);
		Employee emplo = (Employee) treemap.get(1);
		System.out.println(emplo.salary);

	}

}
