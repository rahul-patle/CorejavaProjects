package Scheduling;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Shcedule3 {

	public static void main(String[] args) {
	Calendar calender = Calendar.getInstance();
	
	int year;
	int month;
	int day;
	int hr;
	int minutes;
	calender.set(year =2022,month= 7, day=26,hr= 13,minutes= 01);
	
	Date date = calender.getTime();
	
	//System.out.println(calender);
		new Timer().schedule(new TimerTask() {
			
			int count=0;
			public void run() {
				
					count++;	
						if (count ==3)
						return; // method break;
						
						System.out.println("lets count"+count);
				}
		
		}, calender.getTime(), 3000);
		
	}

}
