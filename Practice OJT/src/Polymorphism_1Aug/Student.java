package Polymorphism_1Aug;

public class Student {
	
 static int  age ,marks;
 final long enrollno;

public Student (int age,int marks,long enrollno) {
	this.age = age;
	this.marks = marks;
	this.enrollno = enrollno;
}
public String toString() {
	return "["+" age="+ age + " marks="+ marks +" enrollno="+ enrollno +"]";
	
}public static void main(String[] args) {
	
	Student a = new Student(10, 20, 12313L);
	
	age =40;
	
	System.out.println(a.toString());
	System.out.println(a);
}

}