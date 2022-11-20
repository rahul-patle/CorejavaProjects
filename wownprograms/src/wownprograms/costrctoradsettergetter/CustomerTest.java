package wownprograms.costrctoradsettergetter;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
// by using getter setter method
		customer.setName("Roashan");
		customer.setLocation("mumbai");
		customer.setStreetway("busway street");
		
		customer.getName();
		customer.getLocation();
		customer.getStreetway();
		System.out.println(customer);

// by using parameterized constructor
		Customer customer1 = new Customer("Roashan","mumbai","buswaystreet");
		
		System.out.println(customer1);
	}
}
