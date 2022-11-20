package Polymorphism_1Aug;

public class AB extends A {

	// method giving us the object
	String method1 ()
	{
		return new String ("java");
		
	}
	
	public static void main(String[] args) {
		A a= new AB();
		a.method1();
//if we create class A object then B class method we cant call
// if we make dynamic dispatch then we call parent class & overriden method
// for child class we have to call B class object
		
		System.out.println(a.method1());
		String string = (String)a.method1(); //type casting

		int s =string.length();
		char j=string.charAt(2);
		
		System.out.println(s+" "+j);
	}
}
