package JunitTesting;

import junit.framework.TestCase;

public class JunitTesting extends TestCase {
	
	MethodTesting a;
	public void setUp() {
		System.out.println("in a setup... before method calling");
		a= new MethodTesting();
	}
	
	public void testAdd() {
		System.out.println("in a add... after method calling");
		assertEquals(20, a.addition(10, 10));
	}

	public void testSub() {
		System.out.println("in a sub...after method calling ");
	
	double result=	a.addition(10, 10);
		String unit ="";
		assertEquals(20, result);
	}

	public void tearDown() {
		System.out.println("in tearDown...after method calling ");
		a=null; // calling for garbage collection
	}


}
