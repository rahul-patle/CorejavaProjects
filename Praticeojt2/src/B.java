
public class B {
	public static void main(String[] args) {
// multiple references point out single object only  single tone
		A a = A.getobject();
		a.m1();

		A a122 = A.getobject();
		a122.m1();
		
	}

}
