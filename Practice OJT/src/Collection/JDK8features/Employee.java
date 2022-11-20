package Collection.JDK8features;

import java.util.Comparator;
import java.util.Objects;

public class Employee {
// trying to use this in lamda expression
	Integer eid;
	String name;
	Integer salary;
	public Employee(Integer eid, String name, Integer salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}
