package Clonning.ShallowClonning;

public class Student implements Cloneable{

	int eid;  // (primitive object)
	Name name;//(no primitive object)
// in shallow clonning only primitive clonning happens,
// non primitive clonning not happens so 
// reference of non primitive pointing to object of s1  	
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", name=" + name + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1 = new Student();
         s1.eid= 10;
		
		Name name = new Name ();
		name.fname="java";
		name.lname="corejava";
		s1.name = name;
		Student s2 = (Student)s1.clone();
		
		System.out.println(s1==s2);
		// this will check address / reference.
		System.out.println(s1.equals(s2));
		
		System.out.println(" name comparision");
		System.out.println(s1.eid == s2.eid); //(same object)
		
	//	[] name id=10 ....
	//	   name,id=10 ....
		
		System.out.println(s1);
		
		System.out.println(s2);
	// changing the object	
		s2.name.fname ="python";
		
		System.out.println(s1.name);
//	there only one non primitive object	
		
		
	}

}
