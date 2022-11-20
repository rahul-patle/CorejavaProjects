
public class A {
	int as;
	
	static A a = new A(); 
	A(){	
	}
	public void  m1 () {
		System.out.println("in ma1");
		this.as=2;
		int b =2;
	}
	public void check() {
		System.out.println(as);
	}
	
	
	
	static A getobject() {
		
		
		return a;
		
	}
	
	
	
	
}
