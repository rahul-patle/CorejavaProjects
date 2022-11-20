package wownprograms.bytostring;

public class Student {

	int rollno;
	String name;
	String  schoolname;
	Department dept;
	public Student() {
		super();
	
	}
	public Student(int rollno, String name, String schoolname,Department dept) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.schoolname = schoolname;
		this.dept=dept;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", schoolname=" + schoolname +" dept=" + dept +"]";
	}
	
}
