package wownprograms.yesweewilldo;

public class Student {

	int eno;
	String name;
	int  marks;
	
	public Student() {
		super();
		
	}
	public Student(int eno, String name, int marks) {
		super();
		this.eno = eno;
		this.name = name;
		this.marks = marks;
	}
	public void setEno (int eno) {
		this .eno= eno;
	}
	public int getEno () {
	
		return eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [eno=" + eno + ", name=" + name + ", marks=" + marks + "]";
	}
}
