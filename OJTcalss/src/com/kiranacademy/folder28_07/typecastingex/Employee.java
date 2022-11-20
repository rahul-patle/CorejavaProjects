package com.kiranacademy.folder28_07.typecastingex;

public class Employee {
	
	int eno , salary;

	public Employee(int eno, int salary) {
		super();
		this.eno = eno;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + "]";
	}
	
	
	

}
