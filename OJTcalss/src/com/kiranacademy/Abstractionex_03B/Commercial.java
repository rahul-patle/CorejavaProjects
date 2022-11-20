package com.kiranacademy.Abstractionex_03B;

public class Commercial extends ElectricityP
{
// inheritance takes all the properties of super class
	
	
	@Override
	void setRate() {
		rate=10;		
	}
}
class Domestic extends ElectricityP
{
	@Override
	void setRate() {		
		rate=5;
	}
}

