package com.kiranacademy.Methodcalling_02B;

public class TestEmployee {

	public static void main(String[] args) {
		
		A a = new A ();
		a.m2();
		
		
		Employee employee=new Employee();
	
		System.out.println(employee.eno);
		System.out.println(employee.salary);
		System.out.println(employee.address);
		
		
		employee.setEno(101);
		employee.setSalary(100000);
		
	// 1. we can pass reference

//		Address address = new Address();
//		address.setCity("pune");
//		address.setState("MH");
//		employee.setAddress(address); // 1. reference is passed as a argument
		
	// 2. pass passing object 
		
		employee.setAddress(new Address("pune", "MH"));//object is passed as a argument

		System.out.println(employee);

	}

}
