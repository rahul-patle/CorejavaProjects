package com.kiranacademy.Inheritance_01;

public class OperationsImpl implements Operations 
{

	public void cube(int no) {
		
		System.out.println(no*no*no);
	}

	
	public void square(int no) {
		
		System.out.println(no*no);
	}
	
	public static void main(String[] args) {
		
		Operations op = new OperationsImpl();
		op.cube(3);
		op.square(2);
	
	}

}
