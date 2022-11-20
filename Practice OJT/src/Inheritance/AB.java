package Inheritance;

public class AB extends A {
	int b = 20;

	public void m2() {
		System.out.println("i am child class method");
		super.method1();
	}
// in this parent class method we are calling by using super keyword
	public String toString() {
		return  super.tostring() + " b " + b;

	}

	public static void main(String[] args) {

		AB bb = new AB();
		bb.m2();
		System.out.println(bb);
		System.out.println(bb.toString());
		
		A aa = new A ();
		aa.method1();
	System.out.println(aa.tostring());
		

	}
}
