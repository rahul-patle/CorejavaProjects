package com.kiranacademy.Abstractionex_03B;

public abstract class ElectricityP 
{
	int rate;

	abstract void setRate();
	
	void calculateBill(int noOfUnit)
	{
		System.out.println(noOfUnit*rate);
	}
	
	public static void main(String[] args) {
	
		ElectricityP obj ;
		
		obj=new Commercial();
		obj.setRate();
		obj.calculateBill(5);
		
		obj=new Domestic();
		obj.setRate();
		obj.calculateBill(5);
	}
}
