package Array;

public class StudentTest2 {
	public static void main(String[] args) {
		Student123[] student = { new Student123("jkl",1, 20), new Student123("klm",3, 30), new Student123("opq",2, 40) };

// by for eachloop		
		for (Student123 student2 : student) {
			System.out.println(student2);
			
			
	// by for loop		
			for (int index = 0; index < student.length; index++) {
				System.out.println(student[index]);
			}
		}
	}
}
