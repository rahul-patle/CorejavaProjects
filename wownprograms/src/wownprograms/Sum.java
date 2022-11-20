package wownprograms;

import java.util.Iterator;
import java.util.Scanner;



public class Sum {

	

	public static void totalmarks() {
		Scanner scanner  = new Scanner (System.in);
		
	System.out.println("give input to number");
	int number = scanner.nextInt();
	int sum = 0 ;
		for(int i=0; i<number;i++) {
			sum = sum+i;
		}System.out.println(sum);
	
	
	}
	public static void main(String[] args) {
		totalmarks();
	}
	
	
}
