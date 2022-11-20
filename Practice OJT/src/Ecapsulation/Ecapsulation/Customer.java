package Ecapsulation.Ecapsulation;
//2//

public class Customer{

	int cid;
	String customerName;
	CustomerOrder o; //( Has-A relationship)(its happen when we create custom class)
			// Order class is also one of the class...
	
	void show()
	{
		System.out.println(cid);
		System.out.println(customerName);
		
//if we have to order class details by taking reference we can call 
		System.out.println(o.itemName);
		System.out.println(o.oid);
		System.out.println(o.quantity);
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", customerName=" + customerName + ", o=" + o + "]";
	}
	
	
	
}
