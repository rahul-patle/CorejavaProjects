package Classtype.CricketBalls;

public class Testball2 {

	public static void main(String[] args) {
		TotalBallsInBag ballsbag1 = new TotalBallsInBag(100,10,10,10);
		
		TotalBallsInBag ballsbag2 = new TotalBallsInBag(100,30,20,50);
		
		TotalBallsInBag.ball_purchase_and_usedtoplay(ballsbag1, ballsbag2, 10, 15, 30);
	
	System.out.println(ballsbag1);
    System.out.println(ballsbag2);
	}
	
	
}
