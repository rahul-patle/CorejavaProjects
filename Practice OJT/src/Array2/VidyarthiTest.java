package Array2;
import java.util.Arrays;
import java.util.Scanner;

import Polymorphism_1Aug.Student;

public class VidyarthiTest {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many objects you want to store ?");
		int size=scanner.nextInt();
		
		Vidyarthi[] vidyarthi= new Vidyarthi[size];
						                              //            0     1     2
		System.out.println(Arrays.toString(vidyarthi));// students [null][null][null]
				
		//System.out.println(students[0].marks);
		
		int rno,marks;
		String subject;
		
		for(int index=0;index<vidyarthi.length;index++)
		{
			System.out.println("Enter rno , subject , marks :-  ");
			rno=scanner.nextInt();
			subject=scanner.next();
			marks=scanner.nextInt();
		
			vidyarthi[index]=new Vidyarthi(subject,rno,marks);// creating object and then storing it in an array at particular index
			
		}
		
		//(1,90) (2,95) (3,98)
	/*	
		int min=Integer.MAX_VALUE;
		Vidyarthi minStudent=null;
		
		for(Vidyarthi vid:vidyarthi)
		{
			if( vid.marks<min)
			{
				min=vid.marks;
				minStudent=vid;
			}
				
		}
		
		System.out.println(minStudent);
		
		
		//System.out.println(10<2 && "java".charAt(4)=='a'); <== dead code
//System.out.println(10<2 & "java".charAt(4)=='a');<== index out of bound
		
		
		
		/* Find out topper student */
		
		
		int max=0;//2
		rno=0;//2
		Vidyarthi maxStudent=null;
		
		for(Vidyarthi vid : vidyarthi)
		{
				int total=totalMarks(vidyarthi,vid.rno);
			
				if( total > max)
				{
					max=total;//170
					maxStudent=vid;
				}	
			
		}// for loop
		System.out.println(maxStudent.rno + " is having highest total " + max);
		
		
	}// main ends
	/* function to calculate total marks */
	// totalMarks(students,1)
	static int totalMarks(Vidyarthi[] vid, int rno) {
		
		int sum=0;
		
		for(Vidyarthi student : vid)
		{
			if(student.rno==rno)
				sum = sum + student.marks;
		}
		return sum;
	}
	
}//class ends
