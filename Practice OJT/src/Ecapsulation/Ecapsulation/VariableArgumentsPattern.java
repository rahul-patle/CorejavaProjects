package Ecapsulation.Ecapsulation;

public class VariableArgumentsPattern {
/**
 * the difference in the array and variable arguments?
 *==> array has fixed size,
 *==> it don't have perfect size getting increase decrease
 */
	public static void addition (int...a) {
		int sum =0;
		for (int element : a) {   //a [10][20][30]
			                      // sum=60
			sum= sum+element;
			
		}System.out.println(sum);
		
	}public static void main(String[] args) {
		addition(10,20,30);
		addition(20,40);
		addition (20,40,60,20);
	//	we can call by classname as well
	}

	
}
