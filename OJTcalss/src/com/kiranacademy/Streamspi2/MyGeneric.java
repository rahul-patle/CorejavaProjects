package com.kiranacademy.Streamspi2;
import java.util.ArrayList;
/* Generic classes are not bound to specific data type , means they are data type neutral classes */
public class MyGeneric<T>
{
	T data;
	
	/* generic method is not bound to specific data type */
	
	T getData()
	{
		return data;
	}

	public static void main(String[] args) {
	
		MyGeneric<String> obj1 = new MyGeneric<>();
		obj1.data="Java is really easy";
		System.out.println(obj1.getData());
		
	    MyGeneric<Integer> obj2 = new MyGeneric<>();
		obj2.data=100;
		System.out.println(obj2.getData());
		
		ArrayList<Integer> al = new ArrayList<>();
		al.get(0);
		
		Object[] objects = {1,"JBK",new Thread()};
		
		ArrayList<String> al2=new ArrayList<>();
		al2.get(0);
		
		// class Employee
		// class TemporyEmployee extends Employee
		// class RegularEmployee extends Employee
		// Employee[] employees = {TemporyEmployee object,RegularEmployee object};
	}

}

