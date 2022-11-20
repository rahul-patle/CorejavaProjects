package com.kiranacademy.cloning;

/* In Shallow clonning , clonning of ONLY primitive is done 
 * In Deep clonning , clonning of Primitive and non-primitive both are done .
 *  */
public class A implements Cloneable

// if not implements  Cloneable interface then exception java.lang.CloneNotSupportedException
{
/**
 * Clonable is marker interface who dont has any method.
 * 
 */
	int no=10;
	String name="JBK";// dependant object (non-primitive)


	public static void main(String[] args) throws Exception {
		
	//create A class object									//	"jbk"	
		A obj1 = new A();//  obj1 ==>[name="JavaByKiran"] A class object at address 1000
	// need to do type cast	
		A obj2 = (A) obj1.clone();// obj2 ==>[name="JBK"] A class object at address 2000
		
		System.out.println("by operator"+(obj1==obj2)); //two object references
		System.out.println("by equals "+(obj1.equals(obj2))); //(check the address)
	
	
			obj1.name="JAVABYKIRAN";
			//obj2.name="jjjj";
			
			System.out.println(obj1);
			
			System.out.println(obj2);
	}
	
	@Override
	public String toString() {
		return "A [no=" + no + ", name=" + name + "]";
	}

}
