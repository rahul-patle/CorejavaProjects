package com.kiranacademy.Inheritance_01;

public abstract class Animal 
{
	abstract void eat();
	
	static void run()
	{
		
		System.out.println("All animals run forward direction");
	}
	
} // class Animal

class Dog extends Animal
{
	void eat() 
	{
		System.out.println("dog eats bones");
		
	}
	
}//class Dog


class Goat extends Animal
{
	void eat() 
	{
		System.out.println("goat eats grass");
		
	}
	
}//class Dog













