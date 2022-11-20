package Scheduling;

import java.util.Timer;
import java.util.TimerTask;

public class Shcedule2 {

	public static void show() {

		int count=0;
		for (int i = 0; i <= 4; i++) {
			count++;	
				if (count ==2)
				return; // method break;
		}
	}
	public static void main(String[] args) {

		show ();
		System.out.println("waits for sometime");
		
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("this i have written");
				
			}
		}, 6000, 3000);
	}

}
