import java.util.Objects;
import java.util.Random;

public class Employee {

	Integer eid;
	Integer salary;
	String name;

	public Employee(Integer eid, Integer salary, String name) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.name = name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {

		return Objects.hash(eid, name, salary);
	}

	// @Override
	// public int hashCode() {
	// return new Random().nextInt();
	// }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(eid, other.eid) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}

}
