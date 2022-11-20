package com.kiranacademy.cloning.shallowclonning;

public class Student implements Cloneable{
/***
 * in shallow clonning only primitive clonning happens 
 * non primitive clonning not happen.
 */
	int id ;
	
	// aggregation/ association
	Name name;
		
	public static void main(String[] args) throws Exception{
		
		Student student1 = new Student();
	// assigning values to variable
		Name name = new Name();
		name.fname="JavaByKiran";
		name.lname="java";
		
		student1.id=1;
		student1.name=name;  //student1=>[id=1,name=Name[fname, lname]]
		
		Student student2=(Student) student1.clone(); // type casting 
// left side class refrence is need to access their methods.	
		
		System.out.println(student1);
		System.out.println(student2); // clone method reference
		
		System.out.println(student1==student2);// check address
		System.out.println(student1.name == student2.name); //true  
		
// ONLY ONE copy Name class object is created and both references are pointing to same object 
		
		
student1.name.fname="kiranacademy";
		
		System.out.println(student1.name.fname);
		System.out.println(student2.name.fname);
		
		student1.id=100;
		System.out.println(student1.id + " " + student2.id);
		
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
