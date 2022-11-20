package Collection.StreamApi;

import java.util.Arrays;

public class HospitalByFilter {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital(1,"pataient1", "corona");
		Hospital hospital2 = new Hospital(2,"pataient2", "corona");
		Hospital hospital3 = new Hospital(3,"pataient3", "fever");
		Hospital hospital4 = new Hospital(4,"pataient4", "Jaundis");
		
System.out.println("filter by corona");		
		Arrays.asList(hospital,hospital2,hospital3,hospital4).
	stream().filter((name)->name.Disease.contains("corona")).forEach(name->System.out.println(name));
System.out.println("filer by fever");
		Arrays.asList(hospital,hospital2,hospital3,hospital4).
		stream().filter((name)->name.Disease.contains("fever")).forEach(name->System.out.println(name));

System.out.println("filer by Jaundis");
		Arrays.asList(hospital,hospital2,hospital3,hospital4).
		stream().filter((name)->name.Disease.contains("fever")).forEach(name->System.out.println(name));
		
	}
}
