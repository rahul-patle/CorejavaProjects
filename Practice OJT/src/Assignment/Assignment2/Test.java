package Assignment.Assignment2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		// 1st
		Employee employee1 = new Employee();
		employee1.setName("Mihir");

		Department department1 = new Department();
		department1.setEid(101);
		department1.setDno(5);
		department1.setSalary(17500);

		employee1.setDepartment(department1);

		// 2st
		Employee employee2 = new Employee();
		employee2.setName("Rahul");

		Department department2 = new Department();
		department2.setEid(102);
		department2.setDno(4);
		department2.setSalary(16500);

		employee2.setDepartment(department2);

		// 3st
		Employee employee3 = new Employee();
		employee3.setName("Hitesh");

		Department department3 = new Department();
		department3.setEid(103);
		department3.setDno(5);
		department3.setSalary(19000);

		employee3.setDepartment(department3);

		// 4st
		Employee employee4 = new Employee();
		employee4.setName("Rajesh");

		Department department4 = new Department();
		department4.setEid(104);
		department4.setDno(4);
		department4.setSalary(18500);

		employee4.setDepartment(department4);
		

		listEmp.add(employee1);
		listEmp.add(employee2);
		listEmp.add(employee3);
		listEmp.add(employee4);
			
		ArrayList<Employee>empList = HighSalary.avgOfHighSalary(listEmp, 4);
		
		System.out.println(empList);
		
	}
}
