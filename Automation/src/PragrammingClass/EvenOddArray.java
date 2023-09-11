package PragrammingClass;

import java.util.Scanner;

public class EvenOddArray {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	String []a= {"Even","Odd"};
	System.out.println(a[num%2]);
	
}
}
