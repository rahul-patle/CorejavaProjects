package Polymorphism_1Aug;

public class BaseTest extends Base {

	private  void tiffin () {
		System.out.println(" i am class basetest");
	}

	
	static void mobile () {
		System.out.println(" in static basetest");
	}

	void m () {
	System.out.println( " i am default basetest");
	}
	

	public static void main(String[] args) {
		Base a = new BaseTest();
		a.m();
		a.box();
		a.mobile();
		BaseTest b = new BaseTest();
		b.m();
		
		
/**
 * So conclusion:= final can't override, but can access to call.
 * 					static can't override, but can access to call.
 * 					private can't override and  not access to call.
 */
	}
}
