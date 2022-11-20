package Logical;

public class FibonacciSeriesEx {
	//Fibonacci Series are those  where every number is the sum of the preceding two numbers, 
	//such that the first two terms are '0' and '1'.
	//0 1 1 2 3 5 8 13 21 34 55
	//here 0+1=1,1+1=2,2+3=5...and so on
	public static void main(String[] args) {
		
		int num=10;
		
		int temp1=0,temp2=1,temp3;
		System.out.println(" " + temp1);
		System.out.println(" " + temp2);
		
		for(int i=1;i<num;i++) {
			temp3=temp1+temp2;
			System.out.println(" " + temp3);
			temp1=temp2;
			temp2=temp3;
		}
	}
}
