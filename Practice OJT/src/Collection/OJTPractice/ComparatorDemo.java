package Collection.OJTPractice;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		
	TreeSet<Employee> treeset = new TreeSet<Employee>(new TestEmployeesAge());
	
	treeset.add(new Employee (1,"rahul",25));
	treeset.add(new Employee (3,"vishal",30));
	treeset.add(new Employee (2,"kulkarni",21));
	
	System.out.println(treeset);

TreeSet<Employee> treeset1 = new TreeSet<Employee>(new TestEmployeeName());
	
	treeset1.add(new Employee (1,"rahul",25));
	treeset1.add(new Employee (3,"vishal",30));
	treeset1.add(new Employee (2,"kulkarni",21));
	
	System.out.println(treeset1);

	}
}