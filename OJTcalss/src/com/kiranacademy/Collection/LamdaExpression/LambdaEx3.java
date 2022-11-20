package com.kiranacademy.Collection.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@FunctionalInterface
interface Operation {
	void add(int a, int b);
	// void show();
}

public class LambdaEx3 {

	public static void main(String[] args) {

		// (arguments)->definition

		Operation o = (a, b) -> {
			int c;
			c = a + b;
			System.out.println(c);

		};

		o.add(10, 20);

		// Operation o=new B();

	}
}