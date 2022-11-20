package Collection.JDK8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamex3 {

	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("shiva");
		Stream  stream=list.stream();
		stream.filter((string)-> string.equals(string))
		
		.forEach(string->System.out.println(string));
		
		
	}
}
