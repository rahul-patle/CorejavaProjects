package Collection.HasmapWildcard;

import java.util.ArrayList;

public class WildcardEx1 {

	
	public static void show (ArrayList <?extends Number> arraylist) {
		
	//This method will allow only that classs object whose parent is Number class	
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arralist = new ArrayList<Integer>();
		show(arralist);
		arralist.add(10);
		System.out.println(arralist);
		ArrayList<String> arralist2 = new ArrayList<>();
		//show(arralist2);
		
		arralist2.add("jbk");
		System.out.println(arralist2);
		
		
	}
}
