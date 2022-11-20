package com.kiranacademy.Collection.LamdaExpression;

interface A
{
	int add(int a,int b);
}


public class LambdaEx 
{

	public static void main(String[] args) {
		
		     // arguments -> function definition
		
		A obj=(a,b)->a+b;
		System.out.println(obj.add(10, 20));
		
		//A obj = new B();

		
	}
}

/*
	class B implements A
	{
			int add(int a,int b)
			{
				return a+b;
			}
	}

*/


/* Functional interface contains SINGLE abstract method
 * Lambda is anonymous function .
 * Lambda expression is used to define abstract method from functional interface , without writing any class.
 * */
