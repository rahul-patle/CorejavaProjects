package Clonning.ShallowClonning;

public class Name implements Cloneable {

	String fname;
	String lname;

	@Override
	public String toString() {
		return "Name [fname=" + fname + ", lname=" + lname + "]";
	}

}
