package Inheritance;

public class RailwayTest extends RailwayTic {

	String status = "ticket confirm";

	public void method2() {
		super.ticket();
	}

	public String toString() {

		return "["+super.toString() + " status :" + status +"]";
	}

	public static void main(String[] args) {
		RailwayTest railwaytest = new RailwayTest();
		railwaytest.method2();
		System.out.println(railwaytest);
	}
}
