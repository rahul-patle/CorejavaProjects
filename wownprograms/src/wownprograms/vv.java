package wownprograms;

import java.util.Arrays;
import java.util.Scanner;

public class vv {
	public static void main(String[] args) {

		// input to array
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = scanner.nextInt();

		Vidyarthi[] vidyarthi = new Vidyarthi[size];
		
		System.out.println(Arrays.toString(vidyarthi));
		int rno = 0, marks = 0;
		for (int i = 0; i < vidyarthi.length; i++) {
			System.out.println("enter rno,marks");
			rno = scanner.nextInt();
			marks = scanner.nextInt();
			vidyarthi[i] = new Vidyarthi(rno, marks);
			 
		}
            
		int max = 0;
			Vidyarthi maxstudent = null;
		for (Vidyarthi vidi : vidyarthi) {
		
			int total = totalmarks(vidyarthi, vidi.rno);
			
			if (total > max) {
				max = total;
				maxstudent = vidi;
			}
		}
		System.out.println(maxstudent + "having highest "+ max);
	}

// summation of marks
	public static int totalmarks(Vidyarthi[] vid, int rno) {
		int sum = 0;
		for (Vidyarthi vidy : vid) {
			if (vidy.rno == rno) {
				sum = sum + vidy.marks;
			}
		}
		return sum;
// check topper student
	}

}