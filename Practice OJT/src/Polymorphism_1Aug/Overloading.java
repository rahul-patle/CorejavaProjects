package Polymorphism_1Aug;

public class Overloading {
	//* char = int
//	 * byte=short=int=long=float=double 

	public static void method1 (Object addharcard) {
		System.out.println(addharcard);
	
	}
	public static void method1 (int addharcard) {
		System.out.println(addharcard);
	
	}
	public static void method1 (float size) {
		System.out.println(size);

	}

	public static void main(String[] args) {
		method1(222L);
		method1(22);
		method1(222222);
		
		
	}

}
