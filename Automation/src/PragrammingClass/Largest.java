package PragrammingClass;

import java.util.Scanner;

/* Find Largest number of three number*/
public class Largest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big=a;
		if (c>big) {
			big=c;
		}
		System.out.println(big);
	}

}
