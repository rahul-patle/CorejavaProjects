package com.ankush.Logical;

import java.util.Scanner;

public class SwappingEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Numbers :-");
		int firstnumber = sc.nextInt();
		System.out.println("Enter the Second Numbers :-");
		int lastnumber = sc.nextInt();
		System.out.println("Before Swapping Values are :-");
		System.out.println(firstnumber + " & " + lastnumber);
		System.out.println("After Swapping Values are");
		firstnumber = firstnumber + lastnumber;
		lastnumber = firstnumber - lastnumber;
		firstnumber = firstnumber - lastnumber;
		System.out.println(firstnumber + " & " + lastnumber);
	}
}
// 10 & 20------Before Swapping
//1st => firstnumber=10+20=30
//2nd => lastnumber=30-20=10----After Swapping===>firstnumber
//3rd => firstnumber=30-10=20----After Swapping====>lastnumber