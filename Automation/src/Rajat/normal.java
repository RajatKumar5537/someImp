package Rajat;

import java.util.Scanner;
/* WAJP t create array element and print all the elements of array*/
public class normal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("Enter elements of array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elements are");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
