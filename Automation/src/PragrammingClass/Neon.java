package PragrammingClass;

import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		String res = isNeon(num);
		System.out.println(res);
	}

	private static String isNeon(int num) {
		int sum=0;
		int sq=sum+num;
		while (sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if (num==sum) {
			return "neon";
		}
		else {
			return "Not a neon";
		}
	}
}
