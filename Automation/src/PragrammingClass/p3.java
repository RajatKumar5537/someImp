package PragrammingClass;
import java.util.Scanner;
public class p3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		int d1=num/10;
		int d2=num%10;
		int res=(d1*d2)+(d1+d2);
		if (res==num)
		{
			System.out.println(num+" your passing number is a special 2 digit num");
		}
		else
		{
			System.out.println(num+" your passing number is not a special 2 digit num");
		}
	}

}
