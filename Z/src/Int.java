import java.util.HashSet;
import java.util.Iterator;

public class Int {

	public static void main(String[] args) {

		
		HashSet<Integer> array = new HashSet<>();
		int[] a = { 2, 7, 8, 9, 10, 12, 16 };
		for (int i = 0; i < a.length; i++) {
			
		array.add(a[i]);
			
		}for (int i : a) {
			System.out.println(i);
		}
	}
}