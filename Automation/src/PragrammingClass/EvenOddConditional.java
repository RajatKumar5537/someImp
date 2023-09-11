package PragrammingClass;

import java.util.Scanner;

public class EvenOddConditional {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("Please enter a second number");
	int b=sc.nextInt();
	System.out.println(a%2==0 ? true :false);
	System.out.println(b%2==0 ? true : false);
}
}
