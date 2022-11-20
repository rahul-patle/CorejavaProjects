package Collection.Stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxEx {
	public static void main(String[] args) {

// find the max salary
		List<Employee> list = Arrays.asList(new Employee(1, "AAA", 60000), new Employee(2, "BBB", 70000),
				new Employee(3, "ccc", 80000));
		
		
		Stream<Employee> stream = list.parallelStream();
		
		// write max instead of min for max value	
	
		Optional<Employee> optional = stream.max((number1, number2) -> number1.salary.compareTo(number2.salary));
		if (optional.isPresent())

			System.out.println("minimum salary"+optional.get());
		else {
			System.out.println("not present");

		}

	}
}