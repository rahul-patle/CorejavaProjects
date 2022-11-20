package com.kiranacademy.Collection.hashmapwildcard;

import java.util.ArrayList;

public class WildCardEx6 {
	
	//when we use wildcard (?) along with interface , then extends keyword replaces implements keyword
	
	static void show(ArrayList<? extends Employee> arrayList)
	{
		for (Employee employee : arrayList) 
		{ 	//Print class as well as package name
			System.out.println(employee.getClass().getName());
			
			if(employee.getClass().getName().contains("PermanentEmployee"))
			{
				employee.salary=employee.salary+10000;
			}
			
			if(employee instanceof TemporaryEmployee)
			{
				employee.salary=employee.salary+5000;
			}
		}
	}
	
	public static void main(String[] args) {
				
		ArrayList<Employee> arrayList2 = new ArrayList<>();
		
		arrayList2.add(new PermanentEmployee(1, 10000, "sachin"));
		arrayList2.add(new PermanentEmployee(2, 20000, "ramesh"));
		arrayList2.add(new TemporaryEmployee(3, 5000, "mahesh"));
		arrayList2.add(new TemporaryEmployee(4, 3000, "rakesh"));
		
		show(arrayList2);
			
		System.out.println(arrayList2);
		
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		//show(al);
	}

}
