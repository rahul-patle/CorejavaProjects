package wownprograms.folder;

import java.util.Calendar;

public abstract class ElectricityPlan 
{
	int rate;

	abstract void setRate();
	
	void calculateBill(int noOfUnit)
	{
		System.out.println(noOfUnit*rate);
	}
	
	static ElectricityPlan getInstance(String plan)
	{
		if(plan.equals("domestic"))
			return new DomesticPlan();
		
		else if(plan.equals("commercial"))
			return new CommercialPlan();
		
		else
			return null;
	}
	
	public static void main(String[] args) {
	
	
	}
	
}
