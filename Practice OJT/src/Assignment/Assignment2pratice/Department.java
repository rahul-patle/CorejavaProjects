package Assignment.Assignment2pratice;

public class Department {
	
	private int employeeid;
	private int departmentno;
	private long salary;
	
	public void setEmployeeid (int employeeid) {
		this .employeeid =employeeid;
		
	}
	public int getEmployeeid() {	
		return employeeid;
	}
	public void setDepartmentno(int departmentno) {
		this.departmentno=departmentno;
		
	}
	public int getDepartmentno() {	
		return departmentno;
	}

	public void setsalary(long salary) {
		this.salary=salary;
		
	}
	public long getsalary() {	
		return salary;
	}
	@Override
	public String toString() {
		return "Department [employeeid=" + employeeid + ", departmentno=" + departmentno + ", salary=" + salary + "]";
	}


}
	
