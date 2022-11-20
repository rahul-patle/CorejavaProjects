package Polymorphism_1Aug;

public class Account {

	int accno;
	long balance;
	public Account() {
		super();
	
	}
	public Account(int accno, long balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", balance=" + balance + "]";
	}
	
	public void Deposit  (int amount) {
		balance = balance+ amount;
	System.out.println("Deposit" +balance);
	}
	public void withdraw (int amount) {
		balance = balance-amount;
		System.out.println("withdraw" +balance);
		
		
	}public static void transferamount(Account account1,Account account2,int amount)

	{ // deposit
		account1.balance =account1.balance+amount;
		
	// withdraw
	 account2.balance =account2.balance-amount;
	// printing both values
	 System.out.println(account1);
		System.out.println(account2);
		
	}

}
