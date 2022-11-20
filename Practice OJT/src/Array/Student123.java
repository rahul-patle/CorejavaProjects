package Array;
public class Student123 {

	String name;
	int rno,marks;
	
	public Student123(String name,int rno, int marks) {
		super();
		this.name=name;
		this.rno = rno;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student123 ["+"name ="+ name +", rno=" + rno + ", marks=" + marks + "]";
	}
	
}
