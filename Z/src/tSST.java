
public class tSST {

	public static int add(int a, int b) {
		
		int c = a + b;
		System.out.println("normal method");
		return c;
	}

	public static int[] add(int... a) {
      System.out.println("variable argument method");
		return a;
	}

	public static void main(String[] args) {

	System.out.println(tSST.add(20,20));
	
	}
}
