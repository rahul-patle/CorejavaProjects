package wownprograms.costrctoradsettergetter;

public class B {
 
	final int number;
  {number = 10;
	}
  void  method () {
	  System.out.println(number);
  }

	public static void main(String[] args) {
		
	new B().method();
	
	A aa = new A ();
	aa.method();
	
}
}