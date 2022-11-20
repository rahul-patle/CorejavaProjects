package Collection.JDK8features;

interface Add {
	int add(int a, int b);

}
public class lamdaex  {
	public static void main(String[] args) {

		Add o = (a, b) -> (a + b);

		System.out.println(o.add(10,20));
	}

}