package com.kiranacademy.AbstractionWithoutSC_04I;

public class CommercialPlan extends ElectricityPlan {
	@Override
	void setRate() {

		rate = 10;
	}
}

class DomesticPlan extends ElectricityPlan {
	@Override
	void setRate() {

		rate = 5;
	}
}
