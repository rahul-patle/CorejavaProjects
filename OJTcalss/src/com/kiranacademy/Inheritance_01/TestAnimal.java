package com.kiranacademy.Inheritance_01;
public class TestAnimal
{
	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		
		Animal animal; // Abstract class's object is not possible
		
		animal = new Dog();
		animal.eat();
	
		// reference of parent can point to object of child class
		
		animal = new Goat();
		animal.eat();
		
		Animal.run();
		
	}
}



