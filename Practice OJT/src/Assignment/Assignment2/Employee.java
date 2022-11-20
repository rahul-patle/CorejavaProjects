package Assignment.Assignment2;

public class Employee {

	private String name;
	private Department department;

	public Employee() {

	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return this.department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String toString() {
		return "name= " + name + " ,department= " + department;
	}

}
