package Collection.HasmapWildcard;

import java.util.ArrayList;

public class WildcardEx3 {

	static void show(ArrayList<? super RuntimeException> arraylist) {
	}

	public static void main(String[] args) {

		ArrayList<Exception>arraylist = new ArrayList<Exception>();
		show(arraylist);
		
		System.out.println(arraylist);
	}
}
