package Collection.JDK8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamex {

	public static void main(String[] args) {
// for integer
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		Stream<Integer> stream = list.stream();
//	filter method contain single arguments
		Stream<Integer> stream2 = stream.filter((number) -> number % 2 == 0);
		System.out.println(stream2);

		stream2.forEach((number) -> System.out.println(number));

	}

}
