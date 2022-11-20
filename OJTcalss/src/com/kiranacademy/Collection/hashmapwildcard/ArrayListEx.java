package com.kiranacademy.Collection.hashmapwildcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.lang.System.out;

public class ArrayListEx {

	public static void main(String[] args) {

		System.out.println(out.getClass());

//CopyOnWriteArrayList<Integer>  arrayList = new CopyOnWriteArrayList<Integer>();
		/**
		 * if need to call remove method of arraylist in iterator then need to use
		 * CopyOnWriteArrayList ==> next example
		 */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);

		Iterator<Integer> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			Integer i = iterator.next();

			if (i == 20)
				iterator.remove();
			// arrayList.remove(i);

// If we use remove() of ArrayList while iterating elements then we get ConcurrentModificationException
		}
		System.out.println(arrayList);
	}

}
