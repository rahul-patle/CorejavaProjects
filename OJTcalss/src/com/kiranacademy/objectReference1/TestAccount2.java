package com.kiranacademy.objectReference1;

public class TestAccount2 {

	public static void main(String[] args) {
		int amount;
		int balance;
		int accno;
	// this is use to call deposit and withdraw method	
		Account account=new Account(accno=1,balance=10000);
	// above is constructor which is use it initialize the non static variable
		System.out.println(account);
	
	    account.deposit(amount=10000); 
		
		System.out.println("amount after deposit :"+account);
		
		account.withdraw(amount=15000);
		
		System.out.println("remaining after withdraw :"+account);
		
	}

}
