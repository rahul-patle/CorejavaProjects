package com.kiranacademy.Collection.Arraylistbasic;

import java.util.ArrayList;

public class Listarray {

	public static void main(String[] args) {
		//without generics
		/*
		 * ArrayList arraylist = new ArrayList();
		 * arraylist.add("java is easy but you need to do practice");
		 * arraylist.add("do practice"); System.out.println(arraylist.toString()); for
		 * (Object arr : arraylist) { System.out.println(arr); }
		 */
// by generic String
		ArrayList<String> Arraystring = new ArrayList<>();

		Arraystring.add("String generic used");
		Arraystring.add("bat");
		Arraystring.add("ball");
		System.out.println(Arraystring.toString());
		for (String arr : Arraystring) {
			System.out.println(arr);
		}

//
		ArrayList<Student> student = new ArrayList<Student>();

		student.add(new Student(11, "rrr", "science"));
		student.add(new Student(11, "jkhh", "jhhhj"));
		
		System.out.println(student);
// integer
		ArrayList<Integer> integer = new ArrayList<>();
		integer.add(0);
		integer.add(1);
		integer.add(2);
		integer.add(3);
		System.out.println(integer);

	} 

}
