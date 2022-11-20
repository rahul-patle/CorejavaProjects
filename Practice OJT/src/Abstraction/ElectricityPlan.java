package Abstraction;

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
	
		
		ElectricityPlan obj ;
		
		obj=new CommercialPlan();
		obj.setRate();
		obj.calculateBill(5);
		
		obj=new DomesticPlan();
		obj.setRate();
		obj.calculateBill(5);
		
//		Calendar c=Calendar.getInstance();
//		c.set(2022, 01, 21);
//		System.out.println(c.getTime());
		
	}
	
}
