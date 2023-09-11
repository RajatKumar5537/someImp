package Rajat;
/* Three machine are manufactured in the industry.
 * give the unique product id for each and every machine.
 * manufactured automatically and serially.
 * */

public class p2 {
	static int count=100;
	int pid;


	{
		pid = count++;
		System.out.println("Product ID "+pid);

	}
	public static void main(String[] args) {
		p2 r=new p2();
		p2 r1=new p2();
		p2 r2=new p2();

	}
}
