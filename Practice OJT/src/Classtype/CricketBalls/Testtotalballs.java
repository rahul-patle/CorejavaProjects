package Classtype.CricketBalls;

public class Testtotalballs {
	public static void main(String[] args) {
		
	int no_of_balls ;
	int redballs ;
	int greenballs;
	int whiteballs ;
	TotalBallsInBag total = new TotalBallsInBag(no_of_balls=100,redballs=10,greenballs=20,whiteballs=30); 
	total.balls_again_purchase_to_play(redballs=10, greenballs=20, whiteballs=20);
	System.out.println("beforeruse:="+total);
	total.balls_Used_to_play(redballs=10, greenballs=10, whiteballs=10);
    System.out.println("afteruse :="+total);
	}
}
