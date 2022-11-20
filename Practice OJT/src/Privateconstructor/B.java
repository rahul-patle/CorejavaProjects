package Privateconstructor;
public class B {
//it use to create object reference ,if single object need then go for this approach 		
	static B obj = new B ();
	private B (){
		
	}

	public void m1 () {
		System.out.println(" i am in m1");
	}
	public void m2() {
		System.out.println("i am in m2");
	}
	 static B getOject() {
		return obj;
		
	}

}
