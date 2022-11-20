package com.kiranacademy.Collection.hashmapwildcard;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapConcEx {
	
	public static void main(String[] args) {
		
		//HashMap<Integer, Integer>   hm = new HashMap<Integer, Integer>();
		
		// 1
		// 2
		// 3
		// 16
		
	/* In regular HashMap , while iterating entries if we try to modify hashmap object, we get ConcurrentModificationException
	 * But in ConcurrentHashMap we do not get such exception
	 *  */ 
		ConcurrentHashMap<Integer, Integer>   hm = new ConcurrentHashMap<Integer, Integer>();
		
		hm.put(1, 10);
		hm.put(2, 20);
		int i=0;
			
//		Iterator<Entry<Integer,Integer>> it=hm.entrySet().iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//			hm.put(101, 2000);
//		}
//		
		for(Entry entry : hm.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue() );
			hm.put(3,i=i+1);
		
	//	while 1st iteration i=0,
	//		  2nd iteration i=1,
	//		3rd iteration i=2; then at 3=2;
		}
			
		
		System.out.println(hm);
		
	}
}
