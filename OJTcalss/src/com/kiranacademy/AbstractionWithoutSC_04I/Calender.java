package com.kiranacademy.AbstractionWithoutSC_04I;

import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {

// we don't know the subclass of Calendar so we create reference without subclass
		Calendar c = Calendar.getInstance();
		c.set(2022,01,21);
		System.out.println(c.getTime());
		
	}

}