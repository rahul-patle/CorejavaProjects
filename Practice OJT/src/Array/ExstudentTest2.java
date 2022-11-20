package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


// all rollno and marks get displayed
public class ExstudentTest2 {

	public static void main(String[] args) throws Exception {

	
	System.out.println(" insert array size");
BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
 int size  = Integer.parseInt(reader.readLine());
 
 ExStudent [] a = new ExStudent[size];

 
 int rollno, marks;
 for(int i=0;i<a.length;i++) {
	 System.out.println("rollno , marks");
	 rollno  = Integer.parseInt(reader.readLine());
	 marks = Integer.parseInt(reader.readLine());
	a[i]=new ExStudent(rollno,marks);
	 
 }for(ExStudent ex : a) {
	 System.out.println(ex);
 }
	
	
	}
}