package com.kiranacademy.Collection.hashmapwildcard;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMapKey {
	
public static void main(String[] args) {
	
	// IdentityHashMap consider address for checking duplicate keys
	// HashMap consider equals() and hashcode() for checking duplicate keys
	
		HashMap<Integer,String> hashmap = new HashMap<Integer, String>();
		
		Integer i1=new Integer(101);// i1(1000) ==> [101] Integer class object at address 1000
		Integer i2=new Integer(101);// i2(2000) ==> [101] Integer class object at address 2000
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode() + " " + i2.hashCode());
		
		hashmap.put(i1,"kiran");
		hashmap.put(i2,"academy");
		
		System.out.println(hashmap);//{101=academy}
			
	}

}
