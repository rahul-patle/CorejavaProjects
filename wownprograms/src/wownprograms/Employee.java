package wownprograms;

public class Employee {

	int eno;
	String name;
	int marks;

	public Employee(int eno, String name ,int marks) {
		super();
		this.eno = eno;
		this.name = name;
		this.marks = marks;	
	}
	Employee (){
		super();
	}

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
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
	
	
	public String toString() {
		return "[eno ="+eno +" name ="+name +" marks ="+ marks +"]";
		
	}
}
