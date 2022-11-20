package com.kiranacademy.Methodcalling_02B;

public class A 
{
	static void m1(String s)
	{
		System.out.println(s.length());
	}
	
protected void m2() {
		System.out.println("i am protected");
	}

	public static void main(String[] args) {
		
		// 1. by passing reference
		
		String s=new String("JBK");
		
		m1(s);
		
		// 2. by passing object
		
		m1(new String("JBK"));
		
		m1("JBK");
		
		
	}

}
