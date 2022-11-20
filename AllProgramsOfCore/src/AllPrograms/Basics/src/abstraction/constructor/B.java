package com.kiranacademy.AllPrograms.Basics.src.abstraction.constructor;

public class B extends A{

	B()
	{
		super(2);
		System.out.println("this is the constructor");
		
	}

	public static void main(String[] args) {
		
		A obj = new B();

	}
}

