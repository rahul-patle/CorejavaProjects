package com.kiranacademy.polymorphism_1_2_Aug;

/* 
 * char = int
 * byte=short=int=long=float=double 
 * */
public class D
{
	int no1,no2;
	
	D(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
	}

	D(int no1)
	{
		this.no1=no1;
	}
	
	D()
	{
		
	}

	
	@Override
	public String toString() {
		return "D [no1=" + no1 + ", no2=" + no2 + "]";
	}

	public static void main(String[] args) {
	
		System.out.println(new D());
		
		System.out.println(new D(10));
		
		System.out.println(new D(10,20));
	
		
	}
}
