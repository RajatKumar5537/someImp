import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int prod=1;
		while (n>0) {
			prod=prod*num;
			n--;
		}
		System.out.println(prod);
	}

}
