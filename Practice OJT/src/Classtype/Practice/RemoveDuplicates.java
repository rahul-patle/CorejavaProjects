package Classtype.Practice;

import java.util.HashSet;

public class RemoveDuplicates {
// This Method use to remove duplicates from sorted as well as 
// unsorted array
	public static void main(String[] args) {

		int a[] = { 1, 3, 6, 2, 4, 6, 8, 9, 3 };

		HashSet<Integer> has = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {

			has.add(a[i]);

		}
		for (Integer dupliremove : has) {

			System.out.println(dupliremove);

		}

	}

}
