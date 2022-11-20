package com.kiranacademy.cloning.deepclonning;

// class Object
// {
// protected Object clone() {  }
// }
public class Name implements Cloneable {

	String fname, lname;

	@Override
	public Object clone() throws CloneNotSupportedException {
		// if only clone method will return then method shows recursion
		// so return super.clone method to avoid recursion.
		return super.clone();
	}

	@Override
	public String toString() {
		return "Name [fname=" + fname + ", lname=" + lname + "]";
	}

	public static void main(String[] args) throws Exception {

		new Name().clone();
	}
}
