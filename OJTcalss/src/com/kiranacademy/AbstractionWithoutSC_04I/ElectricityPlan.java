package com.kiranacademy.AbstractionWithoutSC_04I;

// by get instance when we don't know about subclass.
import java.util.Calendar;

public abstract class ElectricityPlan {
	int rate;

	abstract void setRate();

	void calculateBill(int noOfUnit) {
		System.out.println(noOfUnit * rate);
	}
   
	static ElectricityPlan getInstance(String plan) {
		{
			if (plan.equals("domestic"))
				return new DomesticPlan();// <== it returning subclass object

			else if (plan.equals("commercial"))
				return new CommercialPlan();// <== it returning subclass object

		   	else if (plan.equals("ani"))
				return new aniplan(); // if class is not present then we have to create
	else
				return null;
		}
// we create get instance method to make domestic and commercial plan object

	}

}
