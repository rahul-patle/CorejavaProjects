package com.kiranacademy.basicsex27_07;
//2//

public class Customer{

	int cid;
	String customerName;
	Order o; // has-a relationship
	
	
	void show()
	{
		System.out.println(cid);
		System.out.println(customerName);
		
		System.out.println(o.itemName);
		System.out.println(o.oid);
		System.out.println(o.quantity);
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", customerName=" + customerName + ", o=" + o + "]";
	}
	
	
	
}
