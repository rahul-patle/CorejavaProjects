package Collection.OJTPractice;

import java.util.Comparator;

public class TestEmployeesAge implements Comparator <Employee>{

	@Override
	public int compare(Employee E1, Employee E2) {
		
	return E1.age.compareTo(E2.age);
	}

	
	
}
