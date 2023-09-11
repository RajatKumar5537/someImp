import java.util.Scanner;

public class special {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int a=num%10;
	int b=num/10;
	int res=a+b+a*b;
	if (num==res) {
		System.out.println("Special two digit number");
	}
	else {
		System.out.println("Not a special two digit number");
	}
	}

}
