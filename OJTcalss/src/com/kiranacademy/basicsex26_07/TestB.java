package com.kiranacademy.basicsex26_07;

import java.io.IOException;

public class TestB {
	
	public static void main(String[] args) throws Exception {
		
	//B obj1=new B();
		
	B obj1=B.getObject();
				
	// obj1,obj2 ==> [m1() m2()] B class object
				
	obj1.m1();
	obj1.m2();
				
	B obj2=B.getObject();
//return true because reference 1 & 2 both have same object reference.
	
	System.out.println(obj1==obj2);
	
	Runtime.getRuntime().exec("notepad.exe");
	
		
	}
}
