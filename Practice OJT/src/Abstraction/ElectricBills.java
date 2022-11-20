package Abstraction;

public abstract class ElectricBills {

	 double rate ;
	ElectricBills (){
		
	}
	abstract void setRate();
	
	public void calculationofbills(double units) {
		System.out.println(units*rate);
	}
	public static void main(String[] args) {
		
		ElectricBills a = new CommercialBills();
		a.setRate();
		a.calculationofbills(100);
		
		ElectricBills a1 = new DomesticBills();
		a1.setRate(); //<== if you declare in method then you have to call it
		a1.calculationofbills(50);
	
	}
}
