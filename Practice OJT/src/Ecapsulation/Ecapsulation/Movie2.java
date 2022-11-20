package Ecapsulation.Ecapsulation;

public class Movie2 {

	String moviename;
	String nameofactor;
	int yearofrelease;
	Theater location;
	public Movie2(String moviename, String nameofactor, int yearofrelease) {
		super();
// because each class contain object class as a super class ==>super();
		this.moviename = moviename;
		this.nameofactor = nameofactor;
		this.yearofrelease = yearofrelease;
		this.location=location;
		
	}
	void show() {
		System.out.println(moviename="ss");
		System.out.println(nameofactor="AK");
		System.out.println(yearofrelease=1990);
		System.out.println(location= new Theater(26));
	}
	
	public static void main(String[] args) {
		// Initialization in constructor
		Movie2 aa = new Movie2 ("piku","AB",2016);
		System.out.println(aa.moviename);
		System.out.println(aa.nameofactor);
		System.out.println(aa.yearofrelease);
		//Initialization in method and calling by object reference
		aa.show();
		// to call without object reference method must be static
		
	}
	
}
