package com.kiranacademy.Array.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderEx {

	public static void main(String[] args) throws Exception {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		// what will be the return type of readLine() ?

		System.out.println("Enter name :- ");
		String name=br.readLine(); 
				
		System.out.println("Enter rno :- ");
		int rno=Integer.parseInt(br.readLine()); 
		
		System.out.println(rno + " " + name);
	
	
	}
}
