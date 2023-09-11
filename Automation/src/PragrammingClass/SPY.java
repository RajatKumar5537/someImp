package PragrammingClass;

import java.util.Scanner;

public class SPY {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		String res=isSpy(num);
		System.out.println(res);
	}

	private static String isSpy(int num) {
		int sum=0;
		int prod=1;
		while (num>0) {
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		if (sum==prod) {
		return "SPY";}
		else {
			return "Not a SPY";
		}
	}
}
