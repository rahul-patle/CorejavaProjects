
public class A {

//	Object getmethod () {
//		System.out.println("A");
//		return new Object();
//	}
//
//public static A getObject () {
//	return new B();
//	
//	
//}
//

	A() {
		System.out.println("constructor");
	}

	static {
		System.out.println("static block");
	}

	static void method() {
		System.out.println("static method");
	}
	{
		System.out.println("block");
	}
	public static void main(String[] args) {

		A a = new A();
		a.method();
	}
}
