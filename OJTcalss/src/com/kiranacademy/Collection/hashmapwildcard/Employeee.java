package com.kiranacademy.Collection.hashmapwildcard;

public class Employeee {

	int eid,salary;
	
	String ename;

	Employeee()
	{
		
	}
	public Employeee(int eid, int salary, String ename) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", ename=" + ename + "]";
	}
	
	
	
	
}
