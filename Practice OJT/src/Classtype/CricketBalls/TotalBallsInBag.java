package Classtype.CricketBalls;

public class TotalBallsInBag {

	int no_of_balls,redballs,greenballs,whiteballs;
	static String place_where_stored ="balls Godown";
	
	TotalBallsInBag(int a, int b, int c, int d){
		no_of_balls =a;
		redballs =b;
		greenballs=c;
		whiteballs =d;
	}
	public void balls_again_purchase_to_play(int redballs,int greenballs,int whiteballs){
		no_of_balls=no_of_balls+redballs+greenballs+whiteballs;
		
	}
	public void balls_Used_to_play(int redballs,int greenballs,int whiteballs){
		no_of_balls=no_of_balls-redballs-greenballs-whiteballs;
		
	}
	public String toString() {
		
		return "no_of_balls "+no_of_balls+"redballs "+redballs+"greenballs "+greenballs+"whiteballs "+whiteballs;
	}
	public static void ball_purchase_and_usedtoplay(TotalBallsInBag ballsbag1,TotalBallsInBag ballsbag2,int redballs,int greenballs,int whiteballs)
	{
		// use ballsbag1 for adding balls
		ballsbag1.no_of_balls =ballsbag1.no_of_balls+redballs+greenballs+whiteballs;
	
		// use ballsbag1 for removing balls
		ballsbag1.no_of_balls =ballsbag1.no_of_balls+redballs+greenballs+whiteballs;
		
	}
}
