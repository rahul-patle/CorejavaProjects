package Clonning;

public class v implements Cloneable{

	int no=10;
	String name="ho";
/**
 * clone get created  by calling clone method but;
 * but object are created at new address
 * so furtherc changes in object happens independently
 * after override of equal method check content.
 */

	public static void main(String[] args) throws CloneNotSupportedException {
		v a = new v();
		v a1 = (v)a.clone();
	
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
		
		a.name="kkk";
		a.no= 20;
		System.out.println(a);
		System.out.println(a1);
		
	}
	@Override
	public String toString() {
		return "v [no=" + no + ", name=" + name + "]";
	}
}
