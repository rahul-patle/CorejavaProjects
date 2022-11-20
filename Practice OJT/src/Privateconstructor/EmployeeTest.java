package Privateconstructor;
public class EmployeeTest {

	public static void main(String[] args) {
	// if we have to call single method then use this approach		
		Employee.getOject().m1();
				Employee.getOject().m2();
	//else use this approach for multiple methods calling using object reference
				Employee employee = Employee.getOject();
				employee.m1();
				employee.m2();
				
	}
}
