package Classtype.accountfolder;
public class AccountPracticebymethod {

	int account,balance;
	static String bankname="SBI";
	

	void initializer () {
	// global variable can be directly assign in methods	
		account=20;
		balance=3000;
		System.out.println(bankname);
		System.out.println(account);
		System.out.println(balance);
	}
	public static void main(String[] args) {
		AccountPracticebymethod aa = new AccountPracticebymethod();
		aa.initializer();
	}
}
