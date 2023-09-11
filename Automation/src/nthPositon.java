import java.util.Scanner;
/* to find sum of 1st nth positive number*/
public class nthPositon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n=5;
		int sum=0;
		while (num<=n) {
			sum=sum+num;
			num++;
		}
		System.out.println(sum);
	}

}
