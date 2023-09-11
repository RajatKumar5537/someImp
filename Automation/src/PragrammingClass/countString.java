package PragrammingClass;

public class countString {

	public static void main(String[] args) {
	String a="Java is a programming language";
	char ch[]=a.toCharArray();
	int c=0;
	for (int i=0;i<ch.length;i++) {
		if ((i==0 && ch[i]!=" ")||(ch[i]!=" " && ch[i-1]==" "))
			c++;
	}
	System.out.println(c);
	}

}
