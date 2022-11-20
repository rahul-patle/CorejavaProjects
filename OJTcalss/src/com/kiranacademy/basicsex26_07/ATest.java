package com.kiranacademy.basicsex26_07;

public class ATest {
	
	public static void main(String[] args) {
		// we can not create object such as below
		//A obj1=new A();
		
// static method which return object , when constructor is private
		A obj1=A.getObject();
		
		// obj1 ==> [m1() m2()] A class object
		
		obj1.m1();
		obj1.m2();
		
		A obj2=A.getObject();
		
		//obj2 ==> [m1() m2()] A class object
		
		System.out.println(obj1==obj2);
		
	}
}
