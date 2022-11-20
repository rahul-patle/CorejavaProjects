package com.kiranacademy.polymorphism_1_2_Aug;

public class Student 
{
	int rno,marks;
	final int prn;
	
//  constructor method can not be final
	
	Student(int rno,int marks,int prn)
	{
		this.rno=rno;
		this.marks=marks;
		this.prn=prn;
	}
	
	public static void main(String[] args) {
		
		final Student s1=new Student(1, 100, 501);
		Student s2=new Student(2, 50, 502);
		
		//s1.prn=200;
		s1.marks=80;// s1 is final means it can not refer to new object
		
		// However we can update object refereed by s1
		// s1=new Student(1,1,1);
		System.out.println(s1);
		
		final int a=10;
		//a=20;
		
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + ", prn=" + prn + "]";
	}
}
