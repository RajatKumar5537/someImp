package PragrammingClass;

import java.util.ArrayList;
import java.util.Iterator;

public class practice1 {

	public static void main(String[] args) {
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	System.out.println(ls.contains(10));
	Iterator i=new Iterator();
	while (i.hasNext()) {
		if(i.next()==20) {
			i.remove();
		}
	}
	}

}
