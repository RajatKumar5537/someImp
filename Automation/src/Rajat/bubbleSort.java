package Rajat;

//import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
	//Scanner sc= new Scanner(System.in);
	int[] a= {10,40,20,50};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-1; j++) {
			if (a[j]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		System.out.println(a[i]);
	}
	
	}

}
