import java.util.Scanner;
/* Find Leap year*/
public class leapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int year=sc.nextInt();
		if ((year%4==0 && year%100!=0)||(year%400==0)){
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}
}
