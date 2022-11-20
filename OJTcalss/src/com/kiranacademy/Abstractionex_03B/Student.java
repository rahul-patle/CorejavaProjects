package com.kiranacademy.Abstractionex_03B;

public class Student {

	int rno,marks;
	
	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
	
}
