package com.kiranacademy.basicsex26_07;

// if constructor is private then use get instance method
// note - the method which return object must be static 
// we can not create object by private costructor
 public class A {
	private A() {

	}

	void m1() {
		System.out.println("m1");
	}

	void m2() {
		System.out.println("m2");
	}

	// alternate way to create object

	static A getObject() {
		return new A();
	}

}
