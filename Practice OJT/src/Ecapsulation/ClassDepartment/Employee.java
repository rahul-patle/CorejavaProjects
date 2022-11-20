package Ecapsulation.ClassDepartment;

public class Employee {

	private int empno, salary;
	private Department dept;

	public Employee() {
	}

	public void setEmpno(int empno) {
		if (empno > 0)
			this.empno = empno;
	}

	public int getEmpno() {

		return empno;

	}

	public void setSalary(int salary) {
		if (salary > 0)
			this.salary = salary;
	}

	public int getSalary() {
		return salary;

	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
/*	public String toString() {
		return "[empno "+ empno +" salary "+ salary + " dept "+ dept +"]";
		}*/
	
 public static void main(String[] args) {
	 Employee emp = new Employee();
	 
	 emp.setEmpno(1);
	 emp.setSalary(500000);
	// emp.setDept(new Department(1,"jbk"));
	 
	 Department dept=new Department();
	 dept.setDeptno(101);
	 dept.setDeptname("jbk");
	 emp.setDept(dept);

	 System.out.println(emp.getEmpno());
	 System.out.println(emp.getSalary());
	 System.out.println(emp.dept);
	 
 }
}


