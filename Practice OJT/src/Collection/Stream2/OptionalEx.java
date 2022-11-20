package Collection.Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalEx {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(1, "RRR", 60000), new Employee(2, "sss", 65000),
				new Employee(3, "jjj", 70000));

		Stream<Employee> stream = list.stream();

// fetch salary from employee object to further operation	
		Stream<Integer> stream2 = stream.map((employee) -> employee.salary);
// salary summation	
		Optional<Integer> optional = stream2.reduce((salary1, salary2) -> salary1 + salary2);
// checking object present or not
		if (optional.isPresent())
			System.out.println(optional.get());
		else
			System.out.println("object not present");

	}

}
