package com.kiranacademy.polymorphism_1_2_Aug;

public class CheckMethodsB extends CheckMethodsA {
// flow from B to A

	public static void methodStatic() {
		System.out.println("static method");
	}

	public final void methodPrivate() {
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
	public static void main(String[] args) {
		
		
		
	}
}
