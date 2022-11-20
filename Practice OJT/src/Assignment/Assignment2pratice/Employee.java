package Assignment.Assignment2pratice;

public class Employee {

	private String empname;
	private Department department;

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", department=" + department + "]";
	}

}
