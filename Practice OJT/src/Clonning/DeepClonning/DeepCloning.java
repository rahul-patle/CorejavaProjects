package Clonning.DeepClonning;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student studentclone = new Student();
	
		Name name = new Name ();
		
		name.fname="minutes";
		name.lname ="hours";
		
		studentclone.name = name;
		studentclone.id =22;
		
		Student studentclone2 =  (Student) studentclone.clone();
		
		System.out.println(studentclone);
		System.out.println(studentclone2);
		// check reference / address
		System.out.println(studentclone== studentclone2);
		
		// check content
		System.out.println(studentclone.equals(studentclone2) );
			
		System.out.println(studentclone.name ==studentclone2.name );
		
		studentclone.name.fname ="High";
		studentclone2.name.fname ="medium";
// both objects are different ,so referennce pointing to different object
		System.out.println(studentclone);
		
	}
	
}
