import java.util.Scanner;

public class EvenOddSwitch {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		/*int i=sc.nextInt();
		switch (i%2) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");;
		}*/
		int j=sc.nextInt();
		String[] r= {"Even","Odd"};
		System.out.println(r[j%2]);
	}
}
