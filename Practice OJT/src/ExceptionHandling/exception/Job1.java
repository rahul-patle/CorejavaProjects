package ExceptionHandling.exception;

import java.util.List;

public class Job1 implements Runnable {

	List<Integer> arraylist;

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			int no = arraylist.get(i);
			System.out.println(" get numbers"+no*no);
		}

	}

}
