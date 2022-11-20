package com.kiranacademy.Abstractionex_03B;
import com.kiranacademy.Methodcalling_02B.A;
import com.mysql.jdbc.Driver; 


// protected method calling example 
public class C extends A
{
	C() {
		super(); // to call parent class constructor
		
	}
	public static void main(String[] args) {
		// new A().m2();<======  parent class object can,t be use to call protected method
		new C().m2();
		// clone method is protected method of object class
		// it can be called by using subclass object of Object class.
		try {
			new C().clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//new Object().clone(); // it can't be called because it is protected method 
		
	// protected members is visible
		
	// 1. inside all classes from same package
	// 2. outside of package , ONLY within child class and that too using object of Child class only
	
	// new Driver();
		
	// Class.forName("com.mysql.jdbc.Driver");
		
//  If class is not present in JRE/JDK , then to use this class 
//  add related jar file in project's build path.
		
	}
}
