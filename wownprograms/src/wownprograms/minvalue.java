package wownprograms;

import java.util.Scanner;

public class minvalue {

	public static void main(String[] args) {
	// take array input
		Scanner scanner = new Scanner (System.in);
		System.out.println("give size input to array");
		int size = scanner.nextInt();
		Employee[] employee = new Employee [size];
		
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
		
		// find minimum value
		
		int min = Integer.MAX_VALUE;
		Employee  var =null;
		for(Employee emp :employee) {
			if (emp.marks <min) {
				min =emp.marks;
				var =  emp;
			}
		}System.out.println("minmarks :"+var);
	}
	
	
}
