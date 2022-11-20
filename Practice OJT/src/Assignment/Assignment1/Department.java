package Assignment.Assignment1;

public class Department {

	 int deptno;
     String deptname;

	/*Department(int a, String b) {
		super();
		this.deptno=a;
		this.deptname=b;
	}*/

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getDeptno() {
		return deptno;
		
	}public void setDeptname(String deptname) {
		this.deptname = deptname;
		
	}public  String getDeptname() {
		return deptname;
		
	}public String toString () {
		
		return "[deptno "+ deptno+ " deptname "+ deptname +"]";
	}
/*public static void main(String[] args) {
	
	Department aa = new Department();
	aa.setDeptno(1);
	aa.setDeptname("java");

	System.out.println(aa.getDeptno());
	System.out.println(aa.getDeptname());*/
}

