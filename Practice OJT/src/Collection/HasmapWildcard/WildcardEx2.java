package Collection.HasmapWildcard;

import java.util.ArrayList;

public class WildcardEx2 {

	public static void show(ArrayList<? extends Employee> arraylist) {
		for (Employee employee:arraylist) {

			if (employee.getClass().getName().contains("PermanentEmployee")) {
            // salary updation			
				employee.salary = employee.salary + 10000;
			}

			if (employee.getClass().getName().contains("TemporaryEmployee")) {
				employee.salary = employee.salary + 15000;
			}

		//	if (employee instanceof TemporaryEmployee) {
		//		employee.salary = employee.salary + 15000;

			//}
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
		arraylist.add(new PermanentEmployee(1, 10000, "jbk"));
		arraylist.add(new PermanentEmployee(2, 10000, "vvv"));
		
		arraylist.add(new TemporaryEmployee(3, 20000, "bbb"));
		arraylist.add(new TemporaryEmployee(4, 20000, "ccc"));
		show(arraylist);
		
		System.out.println(arraylist);
	}
}
