package com.kiranacademy.Methodcalling_02B;

public class Employee 
{

	int eno , salary;
	Address address;// non-primitive variable
	
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + "]" + address.toString();
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
