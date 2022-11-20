package Collection.OJTPractice;

import java.util.Scanner;
import java.util.TreeSet;

public class ComparatorDemo2 {

	public static void treeset () {
		
	Scanner scanner = new Scanner (System.in);
	System.out.println(" 1.age ,2. name, 3. exit");
	System.out.println(" enter choice");
	int choice = scanner.nextInt();
	
	TreeSet<Employee> treeset = null;
	if (choice ==1) {	
	 treeset = new TreeSet<>(new TestEmployeesAge());
	}
	else if (choice ==2){
	treeset = new TreeSet<>(new TestEmployeeName());
			
	}else {
		System.out.println("safely exit");
		System.exit(0);
	}
	treeset.add(new Employee (1,"rahul",25));
	treeset.add(new Employee (3,"vishal",30));
	treeset.add(new Employee (2,"kulkarni",21));
	
	System.out.println(treeset);
	treeset ();
	}

public static void main(String[] args) {
	
	treeset ();
	
// recursion working as a loop
//we can achieved it by method calling itself;
	
// main (args);	
	
	
}




}