package Collection.Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tolistmethod {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("java", "java", "advance", "javascript", "Html");
		List<Employee> list1 = Arrays.asList(new Employee(1, "rrr", 333), new Employee(2, "kkk", 444));

		Stream<String> stream = list.stream();
		Stream<Employee> stream2 = list1.stream();

		List<String> list2 = stream.map(element -> element).collect(Collectors.toList());
		List<Employee> list3 = stream2.map(element -> element).collect(Collectors.toList());

		System.out.println(list);
		System.out.println(list2);
		System.out.println(list1);
		System.out.println(list3);

	}
}