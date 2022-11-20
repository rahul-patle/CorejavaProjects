package com.kiranacademy.folder28_07.typecastingex;

import java.util.ArrayList;

public class TypeCasting 
{
	static Object m1(String name)
	{
		if(name.equals("Integer"))
			return new Integer(10);
		
		else if(name.equals("String"))
			return new String("java");
		
		else
			return "nothing here";
	}
	
	public static void main(String[] args) {
//		
		//Object i=m1("Integer"); //i==> [intValue()] Integer class object
		//i.intValue();
		
//		Integer i=(Integer)m1("Integer"); //i==> [intValue()] Integer class object
	//	i.intValue();
	
		//String s=(String) m1("String"); //s==> [java length()] String class object
		//s.length();
		
/* when method return type is Object , we create reference of child class using type casting */
// you can not call the particular	method of another data type if referece is of object or we ca say parent class
// just like dyamic dispatch we can not call child class methods, for that we need chid class object.		
		Object o=m1("Float");
		System.out.println(o);
		
											   //   0  1    index
		ArrayList arrayList = new ArrayList(); // [10,20] ArrayList object
		
		arrayList.add(10);
		arrayList.add(20);
		
		Integer obj=(Integer) arrayList.get(0);

// we can do in collection with or without type casting 
// if used geerics then no need to type cast		
		
		System.out.println(obj.intValue());
		
		
	}
	
}
