package Array;
import java.util.Arrays;
import java.util.Scanner;
// calculate maximum students, marks
public class TestStudent123 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("add size of array   ");
		int size=scanner.nextInt();
		
		// creating the size of array
		Student123[] students= new Student123[size];
						                              
		System.out.println(Arrays.toString(students));
				
		
		String name;
		int rno,marks;
		
		for(int index=0;index<students.length;index++)
		{
			System.out.println("Enter name,rno and marks :-  ");
			
		    name=scanner.next();
			rno=scanner.nextInt();//3
			marks=scanner.nextInt();//70
		
			students[index]=new Student123(name,rno,marks);// creating object and then storing it in an array at particular index
			
		}
		int max=0;//80
		Student123 maxstudent =null;
		for(Student123 student:students)
		{
			if(student.marks> max)
			{
				max=student.marks;	
				maxstudent = student;
			}
		}
		System.out.println(maxstudent);
		scanner.close();
	}
}
