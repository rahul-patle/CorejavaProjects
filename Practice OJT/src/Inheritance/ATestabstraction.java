package Inheritance;

public class ATestabstraction {

	public static void main(String[] args) {

		Goat aa = new Goat();
		aa.Animal();
		aa.run();

		dog bb = new dog();
		bb.run1();
		bb.Animal();
		
// abstract class object pattern must be like this;
// suppose A is abstract class and B is  child class then
// A aa = new B();
		
		
/**if class is abstract then make  the abstract class object reference 
 * and child class object if your class is not abstracted then you have to make an object
 * of child class and t to child class
 * just like bb pointing to dog and aa point object reference pointing to Goat;   
 */
	}
}