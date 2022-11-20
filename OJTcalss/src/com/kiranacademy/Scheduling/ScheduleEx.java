package com.kiranacademy.Scheduling;

import java.sql.Time;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleEx {

	static void show() {
		int i;
		for (i = 1; i <= 5; i++) {
			if (i == 3)
				break;

		}
		System.out.println("i value is " + i);
	}

	public static void main(String[] args) {

		show();

		System.out.println("wait for 5 sec");

//schedule method (timertask object ,begininng delay,interval) 
//	TimerObject
		new Timer().schedule(new TimerTask() 
		{
			@Override
			public void run() {

				System.out.println("Java has all features which programmers require");

			}
		}, 5000, 2000);

	}
/***
 * Timer task is a abstract class , which refers to object of subclass
 * so here with the help of anonymous class. 
 */
}
