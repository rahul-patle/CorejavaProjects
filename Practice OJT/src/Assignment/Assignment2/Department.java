package Assignment.Assignment2;

public class Department {
	
	private int eid;
	private int dno;
	private long salary;
	

	public Department() {
	
	}
	public int getEid() {
		return this.eid;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getDno() {
		return this.dno;
	}
	public void setDno(int dno) {
		this.dno=dno;
	}
	public long getSalary() {
		return this.salary;
	}
	public void setSalary(long salary) {
		this.salary=salary;
	}
	
	public String toString() {
		return "eid= "+eid+ " ,dno= "+dno+" ,salary= "+salary;
	}
}
