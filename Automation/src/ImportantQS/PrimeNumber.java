package ImportantQS;

public class PrimeNumber {
	public static void main(String[] args) {
		int count=0;
		int num=7;
		int i=2;
		while (i<=num/2) {
			if(num%i==0) {
				count++;
				break;
			}
			i++;
		}
		if (count==0)
			System.out.println(num+" is a Prime Number");
		else
			System.out.println(num+" is not a Prime Number");
	}
}
