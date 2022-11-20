package com.kiranacademy.Collection.Arraylistbasic;

public class Student {

	int rollno;
	String sname;
	String subject;
	public Student(int rollno, String sname, String subject) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.subject = subject;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", subject=" + subject + "]";
	}


}
