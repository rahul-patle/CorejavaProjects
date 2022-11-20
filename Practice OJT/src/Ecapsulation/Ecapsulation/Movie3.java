package Ecapsulation.Ecapsulation;

public class Movie3 {

	String moviename;
	String nameofactor;
	
	public Movie3(String moviename, String nameofactor) {
		super();
// because each class contain object class as a super class ==>super();
		this.moviename = moviename;
		this.nameofactor = nameofactor;
		
	}
	public String toString() {
		return "[moviename "+moviename+ " nameofactor "+nameofactor +"]";
		
	}
	
	public void display() {
		System.out.println("moviename "+moviename +"nameofactor"+nameofactor);
	}
	
	public static boolean check(Movie3 movie,Movie3 movie2) {
		if(movie.moviename.equals(movie2.moviename) && movie.nameofactor.equals(movie2.nameofactor))
		{
		return true;
	}
	else {
		return false;
	}
		
}
	public static void main(String[] args) {
		
		Movie3 movie = new Movie3("Thor","Chris Heimsworth");
// see the object reference names look same as used in check method as
// variable, but we can also give different names.	
		Movie3 movie1 = new Movie3 ("Thor","Chris Heimsworth");
		
	//1//	by creating simple method we printed content
		movie.display();
	//2// by toString method we printed content
		System.out.println("*****************");
		System.out.println(movie);
		System.out.println("*****************");
		
///////////////////////////////////////////////////////////////////		
		System.out.println(movie.moviename);
		System.out.println(movie1.nameofactor);
		boolean answer =check(movie,movie1);
		
		System.out.println(answer);
	}
	
}
