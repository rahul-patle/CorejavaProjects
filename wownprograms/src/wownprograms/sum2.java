package wownprograms;

import java.util.Arrays;
import java.util.Scanner;

public class sum2 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner (System.in);
	System.out.println("give size input to array");
	int size = scanner.nextInt();
	Employee[] employee = new Employee [size];
	System.out.println(Arrays.toString(employee));
	int eno;
	String name;
	int marks;
	for (int i = 0; i < employee.length; i++) {
		System.out.println("enter eno , name, marks");
		eno = scanner.nextInt();
		name = scanner.next();
		marks = scanner.nextInt();
		employee[i] = new Employee(eno, name, marks);
		
	}
	
	// higheest marks takeen by a student
	int max =0;
	Employee maxstudent = null;
	for (Employee employee2 : employee) {
		int total = totalmarks( employee, employee2.eno);
		if (total > max) {
			max = total;
			maxstudent =employee2;
		}
		
	}System.out.println(maxstudent + "having higest" +max);
	
	
}
// calculating total marks
	public static int totalmarks(Employee[] emp, int eno) {
		int sum = 0;
		for (Employee employee : emp) {
			if (employee.eno == eno) {
				sum = sum + employee.marks;
			}

		}

		return sum;

	}
}