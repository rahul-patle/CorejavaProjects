package Logical;

import java.util.Arrays;

public class BubbleSortEx {

	public static void main(String[] args) {

		int[] a = { 4, 3, 2, 1 };

		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a)); 
	
	}
}
//Output=>
/*
0 1 2 3....Positions
[4,3,2,1]
1st Itteration when i=0,j=1,
		 => 4,3,2,1
		    3,4,2,1
		 #  ====>
		    2,4,3,1
		 #  ======>
		    1,4,3,2...Done
		    [1, 4, 3, 2]
2nd Itteration when i=1,j=2,
		=> 1,4,3,2
		     ==>
		   1,3,4,2
		     ====>
		   1,2,4,3...Done
		   [1, 2, 4, 3]
3rd Itteration when i=2,j=3,
		=> 1,2,4,3
		       ==>
		   1,2,3,4..Done
		   [1, 2, 3, 4]..Required Output
*/