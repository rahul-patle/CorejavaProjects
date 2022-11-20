package com.kiranacademy.basicsex;

import java.util.ArrayList;

public class Account {
	
	int accno,balance; // non-static variable
	static String bankname="SBI";
	
	/* constructor is used to initilize non-static variable*/
	Account(int a,int b)
	{
		accno=a;
		balance=b;
	}

	/* toString() gives content of object / data of object */
	
	public String toString()
	{
		return " accno= " + accno + " balance= " + balance;
	}
	
	
	public void deposit(int amount)
	{
		balance = balance + amount;
	}
	
	
	public void withdraw(int amount)
	{
		balance = balance - amount;
	}
	
	/* 
	 * 	
		Account account1=new Account(accno=1, balance=10000);
		Account account2=new Account(accno=2, balance=10000);
		
		Account.transfer(account1, account2, 5000);
	
	 */
	
	public static void transfer(Account account1 , Account account2,int amount)
	{
		account1.balance=account1.balance-amount;
		account2.balance=account2.balance+amount;
	}
		
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
}
