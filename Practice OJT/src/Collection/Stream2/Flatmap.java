package Collection.Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Flatmap {

	public static void main(String[] args) {
		
		List <Integer>  list = Arrays.asList(1,2);
		List <Integer>  list2 = Arrays.asList(3,4,5);
		List <Integer>  list3 = Arrays.asList(6,7,8);
		
		List<List<Integer>> listoflist = Arrays.asList(list,list2,list3);
		listoflist.stream().flatMap((number)-> number.stream()).forEach(number->System.out.println(number));
	//flatmap is used to link aslist
	
	}
}
