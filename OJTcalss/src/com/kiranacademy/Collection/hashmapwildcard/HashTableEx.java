package com.kiranacademy.Collection.hashmapwildcard;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		
		
		HashMap<String,Long> hashmap=new HashMap<String, Long>();
		
		hashmap.put("akshay",null);
		hashmap.put("jj",124L);
		hashmap.put(null,1232L);
		Set<Entry<String, Long>> set = hashmap.entrySet();
		
		for(Entry<String,Long> strin :set) {
			
			System.out.println(strin.getKey()+ " "+ strin.getValue());
		}
		
	}

}
