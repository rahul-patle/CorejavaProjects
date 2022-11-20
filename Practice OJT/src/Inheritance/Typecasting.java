package Inheritance;

public class Typecasting {

//1// type casting 	
// when method type is Object then we need to do type casting
	
	public static Object method(String name) {

		if (name.equals("Integer"))
			return new Integer(100);
		else if (name.equals("String"))
			return new String("java");
		else
			return null;
	
	}
	public static void main(String[] args) {
//	this pattern used when method id static
	Integer  r = (Integer) method ("Integer");
		
	//	Typecasting a = new Typecasting();
		//Integer  r = (Integer) a.method ("Integer");
		
										
	
	System.out.println(r.intValue());//<== int value gives the return integer
	// reference used to call method from object
		String r1 = (String)method ("String");
		r1.length();
		System.out.println(r1.length());
		
		Float f = (Float)method ("Float");
		System.out.println(f);
		
		Object o = method("Float");// we use this for null values if any
		System.out.println(o);
	}

}	 
