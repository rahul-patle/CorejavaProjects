package Polymorphism_1Aug;

public class TestAccount extends A {
// method is also return of object of account class
// see data type is not considered in overriding so we can change the 
// data type of child class if parent class method is object method
	Account method1() {

		return new Account(1, 10000);
	}

	public static void main(String[] args) {
// 1st way		
		TestAccount test = new TestAccount();
		test.method1().Deposit(100);// ======>(1)
		
//suitable for single method calling because ,		
		// test.method1().withdraw(100); //<==new object created which consume memory
//********************************************************
// 2nd way
// to call multiple methods we need object reference
		Account a = test.method1();// ======>by using (1)
		a.Deposit(500);
		a.withdraw(1000); // <== updated balance
//*********************************************************
// 3rd way,by passing reference
		Account account1 = new Account(1, 3000); // <== performing deposit
		Account account2 = new Account(2, 3000); // <== performing withdraw
		Account.transferamount(account1, account2, 1000);
//***********************************************************
// 4TH way, by passing object
		Account.transferamount(new Account(3, 5000),new Account(4, 5000), 1000);
		
// 5th in dynamic dispatch  if we have to create reference then we have to do type casting
			A aa = new TestAccount();
			aa.method1();
			Account acount = (Account) aa.method1(); // by type casting
			acount.Deposit(3333);
			acount.withdraw(1221);
			Account.transferamount(account1, account2,0);
	}
}
