package PragrammingClass;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (num==rev) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not a palindrom");
		}
	}

}
