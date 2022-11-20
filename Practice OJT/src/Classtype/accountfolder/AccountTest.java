package Classtype.accountfolder;
public class AccountTest {

 public static void main(String[] args) {
	 
	Account account = new Account(1,10000);

// This we have used for single method
	System.out.println(account); //<=== notify total salary before deposit
	account.deposit(5000);
	System.out.println(account); //<== salary after deposit
	account.withdraw(1000);
	System.out.println(account); //<== salary after withdraw
//*********************************************************************		
	Account account1 = new Account (1,1000); //<== for two first variable
	Account account2 = new Account (2,1000);  // <== for second variable
		
	Account.transfer(account1, account2, 200); //<==this is the  method calling
	
	System.out.println(account1); //<== this show deposit
	System.out.println(account2); //<== this show withdraw
 
 }

}
