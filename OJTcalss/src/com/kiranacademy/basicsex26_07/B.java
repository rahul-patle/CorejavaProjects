package com.kiranacademy.basicsex26_07;
// by returning a refernce in getinstance method, then it converts
//in singleton object

public class B {
	// by making constructor as a private and object as a static
	static B obj = new B(); 
	
	private B() {
	}

	void m1() {
		System.out.println("m1");
	}

	void m2() {
		System.out.println("m2");
	}

	static B getObject() {
		return obj;
	}

}
