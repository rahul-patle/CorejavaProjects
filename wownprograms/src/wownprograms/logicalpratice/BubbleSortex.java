package wownprograms.logicalpratice;

import java.util.Arrays;

public class BubbleSortex 
{

	public static void main(String[] args) 
	{
	             //0  1  2  3
		int[] a= {10,20,30,40};
		        
		
		for(int i=0;i<3;i++)//i=3
		{
			for(int j=i+1;j<4;j++)//j=4
			{
				if(a[i]<a[j])
				{
					int temp;
					temp=a[i]; // i to temp 10 tu rakhle mai dusra lera
					a[i]=a[j]; // j to i 20 tu rakhle mai temp ke pas se le lunga
					a[j]=temp; // temp to j 10 tu rakhle  mujhe nae chaiye
					
				}
			}
			System.out.println(Arrays.toString(a));
		
		}
// this is swapping (index ke bich me hoti dhyan rahe)
//  [10,20,30,40] at first iteration on each index continue swapping take place
//	at i=0, j=1,[20,10,30,40]  0th of i index check with 1st of j
//	at i=0, j=2,[30,10,20,40]  0th of i index check with 2nd of j
//  at i=0, j=3,[40,10,20,30]  0th of i index check with 3rd of j
//  so similar thing of swapping happens with each index of i
//  and we get this		[40, 30, 20, 10]
	}
}
