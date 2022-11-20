package com.kiranacademy.polymorphism_1_2_Aug;

public class CheckMethodsA {
	// can we override all methods lets find out
	public static void methodStatic() {
		System.out.println("static method");
	}
	private static  void methodPrivate() {
		System.out.println("private static method");
	}
	protected void methodProtected() {
		System.out.println("protected method");
	}
	private static void methodStaticPrivate() {
		System.out.println("private static method");
	}
	private final void methodPrivateFinal() {
		System.out.println("private final");
	}
}
