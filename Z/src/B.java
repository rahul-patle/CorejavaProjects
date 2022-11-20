
public class B extends A {
	String getmethod() {
		System.out.println("b");
		return new String();
	}

	public static void main(String[] args) {
       B a = new B ();
       a.getmethod();
		
	}

}
