package Collection.JDK8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamex2 {
// for String
	public static void main(String[] args) {

		List<String> list = Arrays.asList("bat", "ball", "metal");

		Stream<String> stream = list.stream();
//	filter method contain single arguments
		Stream<String> stream2 = stream.filter((string) -> string.contains(string));
		System.out.println(stream2);

		stream2.forEach((string) -> System.out.println(string));

	}
}
