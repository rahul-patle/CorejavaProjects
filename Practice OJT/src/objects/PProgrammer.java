package objects;

public class PProgrammer  {

	int pid;
	String name;
	long salary;
	PAddress paddress;

	public void setPid(int pid) {
		this.pid = pid;

	}
	public int getPid() {
		return pid;

	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;

	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getSalary() {
		return salary;

	}
	
	public PAddress getPAddress() {
		return paddress;
	}

	public void setAddress(PAddress paddress) {
		this.paddress = paddress;
	}

	public String toString () {
		return "["+" pid "+ pid +" name "+ name +" salary" + salary +"]"+paddress.toString();
		
	}
}
