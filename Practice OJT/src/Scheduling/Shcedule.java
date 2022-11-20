package Scheduling;

import java.util.Timer;
import java.util.TimerTask;

public class Shcedule {

	public static void show() {

		for (int i = 0; i <= 4; i++) {

			if (i == 2)
				break; // method break;
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
