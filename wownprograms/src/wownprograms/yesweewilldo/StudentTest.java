package wownprograms.yesweewilldo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) throws Exception {

		// take a input from array
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(" input size");
		int size = Integer.parseInt(reader.readLine());
		Student[] student = new Student[size];
		System.out.println(Arrays.toString(student));

		for (int i = 0; i < student.length; i++) {
			System.out.println("enter eno,name, marks ");
			int eno = Integer.parseInt(reader.readLine());
			String name = reader.readLine();
			int marks = Integer.parseInt(reader.readLine());

			student[i] = new Student(eno, name, marks);

		}
		//System.out.println(Arrays.toString(student));

		// calculate minimum marks

		//int min = student[0].marks;
		int min = Integer.MAX_VALUE;
		Student minmarks = null;

		for (Student student2 : student) {
			// ex   //10         //10
			if (student2.marks < min)
				min = student2.marks;
			
		}
		System.out.println("minimum marks =" + min);

		
		// max marks
		
		int max = 0;
		Student maxstudent = null;

		for (Student student2 : student) {
			// ex   //10        //max
			if (student2.marks >max)
				max = student2.marks;
			
		}
		System.out.println("max marks =" + max);
		
	// calculate student topper
		
		int maxx =0; 
		Student stumarks =null;
		for(Student student2 :student ) {
			int total = totalmarks(student ,student2.eno);
			if (total >maxx) {
				maxx = total;
				stumarks =student2;
			}
		}System.out.println(stumarks.marks+ ":student having roll no"+ maxx);
	
	}
	public static int totalmarks (Student[] stu , int eno) {
		int sum=0;
		for (Student student : stu) {
			if(student.eno == eno) {
				sum = sum + student.marks;
			}	
		}
		return eno;
	}
}
