
public class ArrayPairs {

	public static void main(String[] args) {
// create the pair of array
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		//i=> 0=1
			//1=2;
		for(int i=0; i< a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[j]== a[i]*a[i]) {
					System.out.println("square"+ a[i] +  "=>"+a[j]);
				}
			if(a[j]== a[i]*a[i]*a[i]) {
				System.out.println("cube"+ a[i] +"=>"+ a[j]);
				}
				
				
			}
		}
	}
}