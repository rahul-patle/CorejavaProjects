package Classtype.Practice;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
// This method is only for sorted array
		int a[] = {1,2,2,3,3,6,6,7,7,9,9};

		int j = 0;

		int temp[] = new int[a.length];

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {

				temp[j] = a[i];

				j++;
			}
		}
		temp[j] = a[a.length - 1]; //<== its is use to Store last element
		for (int i = 0; i < a.length; i++) {
		  	System.out.println(temp[i]);
		}
	}
}