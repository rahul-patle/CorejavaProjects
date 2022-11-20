package JunitTesting;

import junit.framework.TestCase;

public class JunitTesting2 extends TestCase {
	
	MethodTesting2 a;
	public void setUp() {
		System.out.println("in a setup... before method calling");
		a= new MethodTesting2();
	}
	public void testAdd() {
		System.out.println("in a add... after method calling");
		String  unit ="";
		double result = a.addition(10, 10,"m");
		assertEquals(20, result);
	}
	public void testSub() {
		System.out.println("in a sub...after method calling ");
	
	double result=	a.Substraction(10, 10,"m");
		
		assertEquals(20, result);
	}
	public void tearDown() {
		System.out.println("in tearDown...after method calling ");
		a=null; // calling for garbage collection
	}

}
