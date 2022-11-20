package com.kiranacademy.folder28_07.dynamicdisptachex;

public class A {

	protected void m1()
	{
		System.out.println("parent method");
	}
	
	void m5() {
		System.out.println("i am not overriden");
	}

/* method name & arguments means method signature 
 * In overriding method signature must be same
 * & return type also must be same
 * In overriding , visibility of method can be increased but not decreased
 * 
 * Polymorphism :- ability to exists in many forms
 * 
 * method overriding is called runtime polymorphism as whose method will be called
 * is decided at runtime based on whose object is created .
 * 
 * Parent object - parent method
 * Child object - child method
 * 
 * It is also called dynamic dispatch
 * 
 * */
}
