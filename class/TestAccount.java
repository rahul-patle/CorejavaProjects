package com.kiranacademy.basicsex;

import java.util.ArrayList;

public class TestAccount {

		public static void main(String[] args) {
			
int accno;
int balance;
			
Account account = new Account(accno=1,balance=100000);
			
System.out.println(account.balance);
System.out.println(account.accno);
System.out.println(account);
System.out.println(account.toString());// object or object reference is used to call non-static members
			
System.out.println(Account.bankname); // class name is used to call static members
			
Account.bankname="state Bank Of India";
System.out.println(Account.bankname);
					
			
ArrayList al= new ArrayList();
			al.add(10);
			al.add(20);
			
			System.out.println(al);// al===> [10,20 toString()] ArrayList class object
			
		}
	}


