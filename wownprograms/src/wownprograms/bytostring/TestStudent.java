package wownprograms.bytostring;

public class TestStudent {

public static void main(String[] args) {
	Student student = new Student();
	
	student.setName("rrr");
	student.setRollno(222);
	student.setSchoolname("ss");
	
	Department department = new Department();
	
	department.setDeptname("java");
	student.setDept(department);
	
	student.getName();
	student.getRollno();
	student.getSchoolname();
	student.getDept();
	System.out.println(student);
	
}
}
