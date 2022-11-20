package objects;

public class A {

// method must be static for this
	public static void method(String s) {
		System.out.println(s.length()); 
	}

	public static void main(String[] args) {
		
//1// this by passing reference
		String s = new String ("java");
		 System.out.println(s);
		 method (s);
//1//  this is special object which store in scp object
		 //String s = "javapoint";

		System.out.println(s);

//2//   this is by passing object		
		method(new String("java"));

	}
}
