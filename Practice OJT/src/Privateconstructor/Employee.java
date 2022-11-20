package Privateconstructor;

public class Employee {

// 1st way to call private constructor is by A getObject static which return
// new A();
// 2nd way to call private constructor is by 
// static B obj = new B ();
	
	private Employee() {
	}

	public void m1() {
		System.out.println(" i am in m1");
	}

	public void m2() {
		System.out.println("i am in m2");
	}

	static Employee getOject() {
		return new Employee();

	}

}
