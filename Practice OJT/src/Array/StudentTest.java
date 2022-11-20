package Array;

public class StudentTest {

	public static void main(String[] args) {
		Student1[] student = new Student1[3];
		student[0] = new Student1(1, 50);
		student[1] = new Student1(1, 60);
		student[2] = new Student1(1, 30);

		for (Student1 student1 : student) {
			System.out.println(student1);
// by 2 ways we can iterate the array. 
			
			for (int index = 0; index < student.length; index++) {
				System.out.println(student[index]);
			}
		}
	}
}
