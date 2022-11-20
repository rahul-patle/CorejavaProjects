package wownprograms.folder;



// client
public class ElectricityplanTest {
	
	public static void main(String[] args) {
	
		ElectricityPlan obj;
		
		// obj => [] DomesticPlan class object
		obj=ElectricityPlan.getInstance("domestic");
		obj.setRate();
		obj.calculateBill(3);
		
		
		obj=ElectricityPlan.getInstance("commercial");
		obj.setRate();
		obj.calculateBill(3);
		
		
		obj=ElectricityPlan.getInstance("abc");
		if(obj!=null)
			obj.setRate();
		
		System.out.println("end of main");
		
	}

}
