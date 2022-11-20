package wownprograms.logicalpratice;

public class PrimeFactors {
	
	public static void main(String[] args) {
		
		int num=12;
			
		for(int i=1;i<=num;i++)
		{
			/* If factor is prime number then only print it */
			
			if(num%i==0 && PrimeNumbers.isPrime(i))
			{
				System.out.println(i);
			}
		}
		
		
	}

}
