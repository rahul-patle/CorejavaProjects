package Clonning.DeepClonning;

public class Name implements  Cloneable {

	String fname;
	String lname;
	
	public Object clone() throws CloneNotSupportedException {
	// while callig clone method use super.clone because
	// it avoid recursion	
		return super.clone();
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		new Name().clone();
	}
	@Override
	public String toString() {
		return "Name [fname=" + fname + ", lname=" + lname + "]";
	}
	

}
