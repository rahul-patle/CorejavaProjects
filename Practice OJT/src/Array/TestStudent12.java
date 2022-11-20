package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TestStudent12 {
	// calculate minimum marks of student;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("add size of array   ");
		int size = scanner.nextInt();

		Student123[] students = new Student123[size];

		System.out.println(Arrays.toString(students));

		String name;
		int rno, marks;

		for (int index = 0; index < students.length; index++) {
			System.out.println("Enter name,rno and marks :-  ");

			name = scanner.next();
			rno = scanner.nextInt();// 3
			marks = scanner.nextInt();// 70

			students[index] = new Student123(name, rno, marks);// creating object and then storing it in an array at
																// particular index
		}

	    int min = Integer.MAX_VALUE;//<== this line stores 0th index marks as min
		Student123 ministudent = null;
		for (Student123 student : students) {
		      if (student.marks < min) {
				min = student.marks;
				ministudent=student;
			}
		       
		}System.out.println("minimum marks"+ministudent); 
	}
}
