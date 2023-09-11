package PragrammingClass;

import java.util.Scanner;

public class pass {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 4 subject marks");
	int sql=sc.nextInt();
	int mt=sc.nextInt();
	int java=sc.nextInt();
	int sel=sc.nextInt();
	if (sql<35 || mt<35 || java<35 || sel<35) {
		System.out.println("Fail");
	}
	else {
		int per=(sql+mt+java+sel)/4;
		if (per>=85) {
			System.out.println("Distinction");
		}
		else if (per>=60) {
			System.out.println("1st Class");			
		}
		else {
			System.out.println("2nd class");
		}
	}
	}

}
