package wownprograms;

public class Vidyarthi {
int rno;
int marks;


public Vidyarthi(int rno, int marks) {
	super();
	this.rno = rno;
	this.marks = marks;
}
public Vidyarthi() {
	super();
	// TODO Auto-generated constructor stub
}
public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Vidyarthi [rno=" + rno + ", marks=" + marks + "]";
}

	
}
