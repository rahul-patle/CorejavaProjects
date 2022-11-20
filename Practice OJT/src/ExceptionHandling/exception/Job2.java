package ExceptionHandling.exception;

import java.util.List;

public class Job2 implements Runnable{

	List <Integer> arraylist;

	@Override
	public void run() {
		for (int i=10;i<= 5;i++ ) {
			int no = arraylist.get(i);
			System.out.println(" get numbers"+no*no);
		}
		
	}
	
	
}
