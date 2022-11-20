package com.kiranacademy.objectReference1;

public class TestAccount3 {

	public static void main(String[] args) {
		
		
		int accno;
		int balance;
		// for 
		Account accobj1=new Account(accno=1, balance=10000);
		Account accobj2=new Account(accno=2, balance=10000);
		
		Account.transfer(accobj1, accobj2, 5000);
		
		System.out.println(accobj1);

		System.out.println(accobj2);
	
		
	}

}
