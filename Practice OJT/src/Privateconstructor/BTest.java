package Privateconstructor;

public class BTest {

	public static void main(String[] args) {
// we are using single object while using multiple reference
		B obj = B.getOject();
		B obj2 = B.getOject();
	
		obj.m1();
		obj.m2();

	}

}
