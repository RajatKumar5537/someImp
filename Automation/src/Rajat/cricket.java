package Rajat;

public class cricket {
	static int bat;
	static int ball;
	static int wicket;
	cricket(int bat,int ball, int wicket){
		this.bat=bat;
		this.ball=ball;
		this.wicket=wicket;
		}
	static void field(int bat,int ball, int wicket) {
		System.out.println("No of Bat need       : "+bat);
		System.out.println("No of ball is need   : "+ball);
		System.out.println("No of wicket is need : "+wicket);
	}
}
