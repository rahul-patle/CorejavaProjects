package Collection.Stream2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Difference {

	public static void main(String[] args) {
/**
 * note : object of stream can be iterate single time.
 * object of collection can be iterate multiple time.
 */
		List<Employee> list = Arrays.asList(new Employee(1, "RRR", 60000), new Employee(2, "sss", 65000),
				new Employee(3, "jjj", 70000));
		System.out.println("collection by mutiple iteration");
		for (Employee employee2 : list) {
	    System.out.println(employee2);
		}
		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for(int i=0; i<list.size();i++) {
			
		}System.out.println(list);
		
		
//****************************************************************************		
		Stream<Employee> stream = list.stream();
		Stream<Integer> stream2 = stream.map(employee -> employee.salary);
		Optional<Integer> optional = stream2.reduce((salary1, salary2) -> salary1 + salary2);
		if (optional.isPresent()) {
			System.out.println("object by stream");
			long sum = optional.get();
			long count = list.stream().count();
			long avg = sum / count;

			System.out.println("count :" + count + " sum:" + sum + " avg:" + avg);
		}

	}
}
