package Rajat;
/* WAJP to create char[] initialize array with -'a'.'b','c' and 'd' and 
 * print all the elements of the array in reverse order in same line*/
public class charA {

	public static void main(String[] args) {
	char [] ch= {'a','b','c','d'};
	for (int i = ch.length-1; i>=0; i--) {
		System.out.print(ch[i]+" ");
	}
	}

}
