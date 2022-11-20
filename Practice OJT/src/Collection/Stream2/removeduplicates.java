package Collection.Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class removeduplicates {
	public static void main(String[] args) {
		
  List<String> list1 = Arrays.asList("java","java", "advance", "javascript", "Html");
		
		Stream<String> stream1 = list1.stream();
		Stream<Object> stream3 = stream1.map(number->number);
		stream3.distinct(). forEach(number->System.out.println(number));
		
	}
}