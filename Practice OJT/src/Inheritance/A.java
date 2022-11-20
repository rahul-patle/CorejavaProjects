package Inheritance;

public class A {
// if we write extend keyword without writing any method in sub class
// then they are implicitely present.
	int a =10;
	
	public static void method1() {
		System.out.println("i am in parent class");	
		
	}
	public String tostring () {
		return "a="+ a;
		
	}
}
