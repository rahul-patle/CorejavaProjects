package wownprograms.logicalpratice;

public class PrimeNumbers {
	// multiple prime numbers 
	public static void main(String[] args) 
	{int j = 1;
		for(int no=1;no<=200;no++)
		{
			boolean ans = isPrime(no);
			
			if(ans)
				//System.out.println(no);
				System.out.println(j++);//<== 
// if we have to count of prime numbers then use j++ instead 
// of no;			
		}
	}
	
	static boolean isPrime(int no)
	{
		int i;
		for(i=2;i<no;i++)
		{
			if(no%i==0)
				break;
		}
				
		if(no==i)
			return true;
		else
			return false;
		
	}
}
