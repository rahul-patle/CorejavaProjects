package Polymorphism_1Aug;

public class CostructorA {

	CostructorA(){
		System.out.println(" this is default constructor");
	}CostructorA(int a){
		System.out.println("This is parameterised costructor");
	}

}
 class B extends CostructorA{
	 
	 B(){
		 super();
	 }
B(int b){
	super(20);
	
	System.out.println(" i b");
}
 
 }