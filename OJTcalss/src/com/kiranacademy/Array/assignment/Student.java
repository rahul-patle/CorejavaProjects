package com.kiranacademy.Array.assignment;

public class Student {

	int rno,marks;
	String subject;
	
	public Student(int rno, String sub,int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
		subject= sub;
		
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}
	
	
}
