package Collection.arrayListex;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(new String("JBK"));
		arrayList.add(new Product(1, 1000, "mouse"));
		arrayList.add(10);//arrayList.add(new Integer(10)) 	
		arrayList.add(10);//arrayList.add(new Integer(10)) 	
		
		System.out.println(arrayList);
		
// [(JBK) String object , (10) Integer object, (10) Integer object, (1,1000,mouse) Product class object   toString() ] 
		                           
								//ArrayList object
		
		
		Product p=(Product) arrayList.get(1); // [pid=1] Product class object
		System.out.println(p.pid);
	}

}
