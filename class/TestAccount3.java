package com.kiranacademy.basicsex;

public class TestAccount3 {

	public static void main(String[] args) {
		
		
		int accno;
		int balance;
		
		Account account1=new Account(accno=1, balance=10000);
		Account account2=new Account(accno=2, balance=10000);
		
		Account.transfer(account1, account2, 5000);
		
		System.out.println(account1);

		System.out.println(account2);
		
		int x=10,y=20;
		Account.add(x,y);
		
	}

}
