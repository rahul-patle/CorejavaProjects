package ExceptionHandling;

public class CustomException2 {
	int balance=10000;

	public void account(int amount) throws Exception {

		if (balance <= 1000) {
			throw new InsufficientBalanceException();
			
				} 
		else {
			balance = balance - amount;
			System.out.println(balance);
	
					}
	}
			public static void main(String[] args) throws Exception {
				try {
					new CustomException2().account(500);
				} catch (InsufficientBalanceException e) {
					System.out.println("insufficient balance");
					e.printStackTrace();
				}
			}
}
