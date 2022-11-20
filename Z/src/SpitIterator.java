import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SpitIterator {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, 2020, "rahesj");
		Employee e2 = new Employee(2, 2022, "Rag");
		Employee e3 = new Employee(3, 2021, "Rag");
		
		
		 Arrays.asList(e1, e2, e3).stream().filter((number)->number.name.equals("Rag")).distinct().forEach(number->System.out.println(number));

		
		

		// filter by name
		List <Employee> list = Arrays.asList(e1, e2, e3).stream().filter((number)->number.name.equals("Rag")).distinct().forEach(number->System.out.println(number));
	}

}
