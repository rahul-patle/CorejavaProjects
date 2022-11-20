package wownprograms.bytostring;

public class Department {

	String deptname;

	public Department() {
		super();
	}
	public Department(String deptname) {
		super();
		this.deptname = deptname;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department [deptname=" + deptname + "]";
	}
	
}
