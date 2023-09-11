public class p2 {
	static a=20;
	int b=50;

	public static void main(String[] args) 
	{
		System.out.println(a);
		p2 b1=new p2();
		System.out.println(b1.b);
		b1.test(10);
		b1.add();
	}
	void test (int b)
	{
		this.b=b;
		System.out.println(b);

	}
	void add() {
		System.out.println(b);
		System.out.println(a);
	}
}
