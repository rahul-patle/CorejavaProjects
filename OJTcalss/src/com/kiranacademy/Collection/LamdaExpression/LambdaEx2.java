package com.kiranacademy.Collection.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaEx2 
{

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(1);
		
//		Collections.sort(arrayList,new MyComparator());

		// sort(List list,Comparator c)
		
		Collections.sort(arrayList,(i1,i2)->i1.compareTo(i2));
		
		System.out.println(arrayList);
		
	}
}

//class MyComparator implements Comparator<Integer>
//{
//
//	@Override
//	public int compare(Integer i1, Integer i2)
//	{
//		
//		return i1.compareTo(i2);
//	}
//	
//}

