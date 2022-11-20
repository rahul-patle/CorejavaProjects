package Collection.JDK8features;

interface Sub {
	 void sub(int a , int b);
}

public class lamdaExpression {
 public static void main(String[] args) {
	

	Sub m=  (a,b)->{
		
		int c = a-b;
		System.out.println(c);
	};
   
m.sub(60, 30);


}}
