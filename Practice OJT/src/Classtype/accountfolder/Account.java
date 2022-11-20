package Classtype.accountfolder;

public class Account {

	// In this we have used the object reference of type Account

	int account_num, balance;
	static String bankname = "Union bank";

	Account(int a, int b) {
		account_num = a;
		balance = b;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;

	}

	public String toString() {

		return "account" + account_num + "balance" + balance;

	}

	public static void transfer(Account account1, Account account2, int amount) {
// if method is static then assign global variable like this
// if not then global use non static method like above particular 
		account1.balance = account1.balance + amount;
		account2.balance = account2.balance - amount;
	}
}