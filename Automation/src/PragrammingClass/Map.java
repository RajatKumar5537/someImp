package PragrammingClass;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "India");
		hm.put(102,"Odisha");
		hm.put(103,"Ganjam");
		System.out.println(hm);
		System.out.println(hm.get(101));
		System.out.println(hm.containsKey(102));
		System.out.println(hm.containsValue("Ganjam"));
		System.out.println(hm.containsValue("Ganj"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		HashMap hm1=new HashMap();
		hm1.put(104,"Bhubaneswar");
		hm1.putAll(hm);
		System.out.println(hm1);
		hm1.remove(104);
		System.out.println(hm1);
		hm1.clear();
		System.out.println(hm1);


	}

}
