package objects;

public class TestProgrammer {

	public static void main(String[] args) {
		PProgrammer programmer = new PProgrammer();
		programmer.setPid(111);
		programmer.setName("IronMan");
		programmer.setSalary(50000000);

		programmer.getPid();
		programmer.getName();
		programmer.getSalary();

		PAddress paddress = new PAddress("maharashtra","puneeeee");
		
		paddress.setState("MH");
		paddress.setCity("Pune");
	// This is by passing the reference	
//1// by passing object reference   ***remember***one thing reference must be pass after object creation
		programmer.setAddress(paddress);      //<====================
//2//	by passing object
	//	programmer.setAddress(new PAddress("maharashtra","puneeeee"));
		System.out.println(programmer);
/**
 * we can get the object by using parameterized constructor;
 * we can get the object by using getter setter method
 */
	}
}
