package wownprograms;

import java.util.Scanner;

public class minivalue {
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
		int min = employee[0].marks;
		Employee minStudent = null;

		for (Employee vid : employee) {
			if (vid.marks < min) {
				min = vid.marks;
				minStudent = vid;

			}

		}
		System.out.println("minimum value" + minStudent);

	}
}
