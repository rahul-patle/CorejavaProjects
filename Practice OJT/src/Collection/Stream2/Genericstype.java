package Collection.Stream2;

import java.util.ArrayList;

public class Genericstype <T> {
// generic type classes are neutral generic type classes 
	//any generic can be used.
// pattern is just like arraylist object creation	
	T data;
 void Setdata (T data) {
	 
 }
	
     T GetData () {
		return data;
    	 
     }
 public static void main(String[] args) {
	
	 ArrayList<Integer> integer = new ArrayList<Integer>();
	 integer.add(1);
	 integer.add(2);	
	 System.out.println(integer);
//*/**/*/*/*/*//***//*/*/****************/*//**////////**//**/*/*/*/*/*/*/
	 
	 Genericstype<Integer> igen = new Genericstype<>();
	 igen.data=10;
	 System.out.println(igen.GetData());
	 	
	 Genericstype<String> igen2= new Genericstype<>();
	 igen2.data="java is easy";
	 System.out.println(igen2.GetData());
//******************///*////////////////////**/*////////////*/*/********///	 
	 Genericstype<Employee> igen3 = new Genericstype<>();
	 igen3.data= new Employee(1,"name",5656);
	 igen3. data= new Employee(2,"kkk",5656);
	 igen3.Setdata(new Employee(2,"kkk",5656));
	 System.out.println(igen3.GetData());
	 
	 
	 ArrayList<Employee> emp = new ArrayList<>();
	 emp.add(new Employee(1,"",3232));
	
 
 
 }

}
