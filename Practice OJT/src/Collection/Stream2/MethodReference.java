package Collection.Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReference {
	public static void main(String[] args) {

		
	List<String> list = Arrays.asList("java","java", "advance", "javascript",
		  "Html");
		  
    Stream<String> stream = list.stream(); 
    Stream<Integer> stream2 = stream.map(element-> element.length()*2);
    stream2.forEach(element->System.out.println(element));
		 
//************************************************************************		
    System.out.println("method reference");	
	
		List<String> list1 = Arrays.asList("java", "java", "advance", "javascript", "Html");

		Stream<String> stream1 = list1.stream();
//method reference using in map
//map is use to transform the object		
		Stream<Integer> stream3 = stream1.map(String :: length);
	
		 stream3.forEach(System.out::println);

	}
}