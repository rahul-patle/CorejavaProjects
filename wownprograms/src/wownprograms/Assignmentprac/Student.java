package wownprograms.Assignmentprac;

public class Student {
	String name;
	int rollno, marks;

	public Student(String name,int rollno, int marks) {
		super();
		this .name= name;
		this.rollno = rollno;
		this.marks = marks;
	}

	public Student() {
		super();

	}
	@Override
	public String toString() {
		return "Student ["+"name=" + name + "rollno=" + rollno + ", marks=" + marks + "]";
	}

}
