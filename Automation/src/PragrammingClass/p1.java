package PragrammingClass;
import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big=a;
		if (c>big)
		{
			big=c;
		}
		System.out.println(big);
	}

}
