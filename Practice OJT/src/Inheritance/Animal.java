package Inheritance;

public class Animal implements AInterclass {
	
	
	
	public void Animal() {
		System.out.println("i have a animal who is dog");
	}

	@Override
	public void animalname() {
		System.out.println("there are two animal present in this dog and goat");
		
	}
}
	class dog extends Animal {

		public void run1() {

			System.out.println("all animal move in forward direction");
		}

	}

	class Goat extends Animal {

		public void run() {

			System.out.println("all goat animal move in forward direction");
		}

	}