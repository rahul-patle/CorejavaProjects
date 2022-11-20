package Array;

import java.util.Scanner;

//Iterate the array and 
public class ExstudentTest {
/**
 * take a input of size from scanner and store in array;
 * iterate for loop and take input of particular (items)
 * take reference of object from previous array store in index;
 * print by foreach loop  
 *
 */
	public static void main(String[] args) {
		System.out.println("take a size of array");
		Scanner scanner = new Scanner (System.in);
		int size = scanner.nextInt();
		
		ExStudent[] ex = new ExStudent [size];
		
		int rollno=0, marks=0;
		for (int index=0; index < ex.length;index++) {
			System.out.println("input roll no, and marks");
			rollno = scanner.nextInt();
			 marks = scanner.nextInt();
	//Storing the object at particular index.
			 ex [index] =new ExStudent (rollno,marks);
		}for (ExStudent exStudent : ex) {
			System.out.println(exStudent);
		}
	
	}
	
}
