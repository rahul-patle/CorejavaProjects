package Array;

public class ExStudent {
	int rollno, marks;

	public ExStudent(int rollno, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
	}

	public ExStudent() {
		super();

	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}

}
