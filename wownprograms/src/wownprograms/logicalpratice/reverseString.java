package wownprograms.logicalpratice;

import java.util.Iterator;

public class reverseString {

	public static void main(String[] args) {

		int[] a = { 2, 2, 6, 7, 8 };
		int [] temp = new int [a.length];
		int k=0;
	for (int i = 0; i < a.length - 1; i++) {	
			
				if(a[i]!=a[i+1]) {
					temp[k]=a[i];
					k++;
				}
				
		}temp[k]=a[a.length-1];
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(temp[i]);
		}
	}
}