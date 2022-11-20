import java.util.HashMap;

public class HashmapEqualexample {

	public static void main(String[] args) {
		
		HashMap <Employee, String> hashmap = new HashMap<>();
		
		Employee e1 = new Employee (1,606060,"jkl");
		Employee e2 = new Employee (1,606060,"jkl");
		
		hashmap.put(e1,"yyyyy");
		hashmap.put(e2,"zzzzz");
		
		//it check only key address
		
// when we override equals and hashcode method then
// address are same; 
// equal methods check content only if same=> true or false

// first always check equals if true then check hashcode otherwise it won't

	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode() + " " +e2.hashCode());
	
	System.out.println(hashmap);
	}
	
}