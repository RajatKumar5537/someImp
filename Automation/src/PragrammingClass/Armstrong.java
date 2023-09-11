package PragrammingClass;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		int temp=num;
		int temp1=temp;
		int sum=0;		
		int count=0;
		while (num>0) {
			num=num/10;
			count++;
		}
		while (temp>0) {
			int rem=temp%10;
			int pow=count;
			int prod=1;
			while (pow>0) {
				prod=prod*rem;
				pow--;
			}

			sum=sum+pow;
			temp=temp/10;
		}
		if (temp1==sum) {
			System.out.println("ArmStrong");
		}
		else {
			System.out.println("Not a ArmStrong");
		}
	}
}

