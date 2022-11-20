package wownprograms;

import java.util.Iterator;
import java.util.Scanner;

public class greate {

	public static void main(String[] args) {
		// take input of array siuze form array
		System.out.println("input array size");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();

		Employee[] employee = new Employee[size];

		int eno;
		String name;
		int marks;
		for (int i = 0; i < employee.length; i++) {
			System.out.println("enter eno , name");
			eno = scanner.nextInt();
			name = scanner.next();
			marks = scanner.nextInt();
			employee[i] = new Employee(eno, name, marks);
		}
	
		for (Employee employee2 : employee) {
			System.out.println(employee2.toString());
		}

		
		int min = employee[0].marks;
		Employee var =null;
		
		  for (Employee employee2 : employee) {
	//		  	10>0
			  if(employee2.marks>min)
				 
				 min = employee2.marks;
				 var = employee2;
		
			 
		 }
		 
		
		int max = Integer.MAX_VALUE;
		Employee minStudent = null;

		for (Employee vid : employee) {
			if (vid.marks < max) {
				max = vid.marks;
				minStudent = vid;
				System.out.println("minimum value"+minStudent);
			}

		}

	}

}
