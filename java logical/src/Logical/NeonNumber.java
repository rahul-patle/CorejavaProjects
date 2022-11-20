package com.ankush.Logical;

import java.util.Scanner;

public class NeonNumber {
	
	//Neon Numbers => 9²=81..& 8+1=9,such no's are Neon Numbers
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int num = sc.nextInt();
		
		int mul=num*num;
		int sum=0;
		
		while(mul>0) {
			sum=sum + mul%10;
			mul = mul/10;
		}
		if(sum==num) {
			System.out.println(num +" is a Neon Number");
		}else {
			System.out.println(num +" is not a Neon Number");
		}
	}
}
