package com.kiranacademy.polymorphism_1_2_Aug;

public class Derived  extends Base
{

	private void m1()
	{
		System.out.println("child method");
	}
//	
//	void m2()
//	{
//		
//	}
//	
	/* It is not overriding , hence which object is created is NOT related . object reference will decide */
	static void m3()
	{
		System.out.println("Derived method");
	}
	
	void m4()
	{
		System.out.println("Derived method");
	}
	public static void main(String[] args) {
		
		Derived d =new Derived();
		
		d.m1();
		
		d.m2();
		
		d.m3();
		
		Base b= new Derived();
		b.m3();
		// based on reference , m3() of Base class is called
		// Notice that m3() is not overriden as it is static
		// Hence whose object is created is NOT important
		
		b.m4();// It is overriding , hence object is considered
		}
}
