package Collection.arrayListex;

import java.util.ArrayList;

public class ArrayListGenericsEx {
	
	public static void main(String[] args) {
		
		ArrayList<Product> arrayList = new ArrayList<>();
		
		//arrayList.add(new String("JBK"));
		arrayList.add(new Product(1, 1000, "mouse"));
		int pid;
		int price;
		String name;
		Product p2=new Product(pid=2 , price=2000, name="keyboard");
		arrayList.add(p2);
		
		System.out.println(arrayList);
		
// [(1,1000,mouse) Product class object (2,2000,keyboard) Product class object   toString() ] 
		                           
								//ArrayList object
		
		
		Product p=arrayList.get(1); //p===> [pid=1] Product class object
		System.out.println(p.pid);
	}

}
