package Ecapsulation.Ecapsulation;

//3//
public class Movie 
{
	// This are the class level variables
    String movieName;
    int yor;
      
    
    public Movie(String movieName, int yor) {
		super();
		this.movieName = movieName;
		this.yor = yor;
	}

    @Override
    public String toString() 
    {
    	return "moviename is " + movieName + " year of release is " + yor;
    }
   
    
   // Class level data type contain all data types(char,float,boolean,int)etc
    public static boolean equals(Movie movie1,Movie movie2)
    {
    	if(movie1.movieName == movie2.movieName && movie1.yor==movie2.yor)
    		
    		return true;
    	
    	else
    		
    		return false;
    }
   	public static void main(String[] args) {
		
		Movie movie1 = new Movie("Laggan",2010);
    	Movie movie2 = new Movie("Laggan",2010);
    	System.out.println(movie1);
       	System.out.println(movie2);
    	boolean answer=Movie.equals(movie1, movie2);
    	
    	System.out.println(answer);
    	
	}
	
}