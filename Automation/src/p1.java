
public class p1 {
	static int a=30;
	static {
		System.out.println(a);
		System.out.println(p1.a);
		
	}

	public static void main(String[] args) {
		p1 a1=new p1();
		System.out.println(a1.a);
		
	}

}
