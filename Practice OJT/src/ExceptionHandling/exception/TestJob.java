package ExceptionHandling.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestJob {
// example of multithreading
	public static void main(String[] args)throws Exception {
		List<Integer> arraylist = Arrays.asList(1, 2, 3, 6, 6, 4, 6,10,12,23);

		Job2 job2 = new Job2();
		job2.arraylist = arraylist;
		
		Job1 job = new Job1();
		job.arraylist = arraylist;
		Thread thread1 = new Thread(job2);
		thread1.start();
		Thread thread2 = new Thread(job);
		thread2.start();

	}
}
