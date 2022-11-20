package Collection.OJTPractice;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	Integer eid;
	String name;
	Integer age;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String name, int age) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, eid, name);
	}
	
	
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return age.compareTo(e.age);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(age, other.age) && Objects.equals(eid, other.eid) && Objects.equals(name, other.name);
	}
	

	
}
