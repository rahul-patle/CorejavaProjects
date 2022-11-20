package com.kiranacademy.basicsex;

public class TestAccount2 {

	public static void main(String[] args) {
		
		int balance;
		int accno;
		
		Account account=new Account(accno=1, balance=10000);
		
		System.out.println(account);
	
		account.deposit(10000);
		
		System.out.println(account);
		
		account.withdraw(15000);
		
		System.out.println(account);

	}

}
