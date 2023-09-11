package Rajat;

import java.util.ArrayList;

public class sample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(40);
		//System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add(80);
		al2.add(90);
		al2.add(100);
		//System.out.println(al2);
		al.clear();
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
	}

}
