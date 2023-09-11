package PragrammingClass;

import java.util.Scanner;

public class primeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		int count=0;
		int i=2;
		while (i<=num/2) {
			if (num%i==0) {
				count++;
				break;
			}
			i++;
		}
		if (count==0)
			System.out.println("Prime");
		else 
			System.out.println("Not a Prime number");
	}
}
