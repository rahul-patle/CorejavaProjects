package Ecapsulation.Ecapsulation;

public class SubstractionByVariableArgu {

	public static void sub(int...a) {
		int substraction =0;
		for(int number :a) {
	// we read it as (integer number for a)
			substraction =substraction-number;
		}System.out.println(substraction);
		
	}
	public static void main(String[] args) {
		//SubstractionByVariableArgu sub = new SubstractionByVariableArgu();
		//sub.sub(20,40);
		sub(30,60,40);
		
	}
}