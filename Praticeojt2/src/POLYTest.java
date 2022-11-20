
public class POLYTest extends polymorphism {

	public void metodm2() {
		System.out.println("child class");
	}

	public static void main(String[] args) {

		POLYTest a = new POLYTest();
		a.metodm2();
        a.protectedMethod();
		a.method1();
		a.mfinal();
		polymorphism.mstatic();
		

	}

}
