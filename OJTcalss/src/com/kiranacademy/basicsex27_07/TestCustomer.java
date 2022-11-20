package com.kiranacademy.basicsex27_07;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		
		//System.out.println(customer.o);
		System.out.println(customer.cid);

		customer.cid=1;
		customer.customerName="jatin";
		customer.o=new Order(1,30,"pen");
		
		
		customer.show();
		
		System.out.println(customer);
	}
}
