package com.kiranacademy.basicsex27_07;

//3//
public class Movie 
{
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
    	
    	boolean answer=Movie.equals(movie1, movie2);
    	
    	System.out.println(answer);
    	
	}
	
}
