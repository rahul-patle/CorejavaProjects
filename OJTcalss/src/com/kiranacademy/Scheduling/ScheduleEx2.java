package com.kiranacademy.Scheduling;


import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleEx2 {

public static void main(String[] args) {
	
	Calendar c=Calendar.getInstance();
	
	int year;
	int month;
	int day;
	int hour;
	int min;
	
	c.set(year=2022, month=7, day=26, hour=12, min=58);
	
	//Date date = c.getTime();
		
	new Timer().schedule(new TimerTask() 
	{
		int count=0;
		
		public void run() 
		{
			count=count+1;
			
			if(count==4)
				return;
			//	System.exit(0);
			
			System.out.println("All is well " + count);
			
		}
	}, c.getTime(),2000);
	
}	
	
}


class D extends TimerTask
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("All is not well");
		
	}
	
}





