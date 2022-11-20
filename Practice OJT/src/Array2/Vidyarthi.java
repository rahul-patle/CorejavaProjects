package Array2;
public class Vidyarthi {

	String name;
	int rno,marks;
	
	public Vidyarthi(String name,int rno, int marks) {
		super();
		this.name=name;
		this.rno = rno;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Vidyarthi ["+"name ="+ name +", rno=" + rno + ", marks=" + marks + "]";
	}
	
}
