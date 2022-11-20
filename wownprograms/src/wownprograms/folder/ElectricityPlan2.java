package wownprograms.folder;

import java.util.Calendar;

public abstract class ElectricityPlan2 {

	double rate;

	abstract void setrate();

	public void billamount(int units) {
		System.out.println("total amount" + units * rate);
	}

	public static ElectricityPlan2  getinstance(String plan ){
		
		if(plan.equals("harbijli"))
		
		return new Hargharbijli();
		
		else if(plan.equals("Domesticplan"))
			return new Domesticbill();
	    else
	    	System.out.println("not available");
		    return null;
	
	}
	public static void main(String[] args) {
		/*ElectricityPlan2 obj = new Domesticbill();
		obj.setrate();
		obj.billamount(10);
		
		ElectricityPlan2 obj1 = new Hargharbijli();
		obj1.setrate();
		obj1.billamount(10);*/
		
		ElectricityPlan2 obj ;
		obj =  ElectricityPlan2.getinstance("Domesticplan");
		obj.setrate();
		obj.billamount(30);
		
	
		obj =  ElectricityPlan2.getinstance("harbijli");
		obj.setrate();
		obj.billamount(60);
	}

}