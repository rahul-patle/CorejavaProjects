package Collection.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApibyFiltermethod {
/**
 * filter method return type is boolean so need boolean input
 * Note--> stream fuction iterate only single time.
 * Collection--> can iterate nultiple times 
 */
	public static void main(String[] args) {
// asList()	--> object of List	
		List<Integer> list =Arrays.asList(10,20,30);
// stream() --> object of stream		
		Stream<Integer> stream =list.stream();
// filter method()	object of stream
		
		
//	Stream <Integer>stream2 = stream.filter((number)->number.equals(number));
		Stream <Integer>stream3 = stream.filter((number)-> number%2 == 0);
		
		stream3.forEach(number->System.out.println(number));
	}
}
