package Assignment.Assignment2;

import java.util.ArrayList;

public class HighSalary {
// to fetch the high salary
	public static ArrayList<Employee> avgOfHighSalary(ArrayList<Employee> empList, int Dno) {

		ArrayList<Employee> listOfEmp = new ArrayList<Employee>();
		
		long avgSalary = 0;
		int count = 0;
		
		for (Employee employee : empList) {
			if (Dno == employee.getDepartment().getDno()) {
				avgSalary = avgSalary + employee.getDepartment().getSalary();
				count++;
			}
		}
		if (count != 0) {
			avgSalary = avgSalary / count;
			for (Employee employee : empList) {
				if (Dno == employee.getDepartment().getDno()) {
					if (avgSalary < employee.getDepartment().getSalary()) {
						listOfEmp.add(employee);
					}
				}
			}
			return listOfEmp;
		} else {
			System.err.println("please enter valid department number.");
			return null;
		}

	}

}
