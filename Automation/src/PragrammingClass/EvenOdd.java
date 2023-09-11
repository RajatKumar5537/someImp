package PragrammingClass;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		if (i%2==0) {
			System.out.println(i+" is a Even Number");
		}
		else {
			System.out.println(i+" is a Odd Number");
		}

	}
}
