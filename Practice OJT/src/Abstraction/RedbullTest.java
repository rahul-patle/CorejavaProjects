package Abstraction;

public  class RedbullTest implements Redbull{
/**
 * we can't create an Object of abstract class as well as interface
 * So for create object we need a subclass of interface or of abstract class
 * only by inheritance we can achieve subclass
 */

	@Override
	public void callredbull() {
		System.out.println("this is override method");
	}
	public static void main(String[] args) {
		
		Redbull a =new RedbullTest();
		a.callredbull();
	}
}
