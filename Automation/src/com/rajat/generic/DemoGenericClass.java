package com.rajat.generic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DemoGenericClass {
	public static void main(String[] args) throws IOException {
		List<String> ls=new ArrayList();
		ls.add("susil");
		ls.add("rajat");
		ls.add("silpa");
		int length=ls.size();
		System.out.println(length);
		FileLib f=new FileLib();
		String un = f.getPropertyFile("username");
		String pwd = f.getPropertyFile("password");
		String url = f.getPropertyFile("url");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		String exData = f.getExcelFile("Emp", 4, 2, "./data/EmpDetail.xlsx");
		System.out.println(exData);
		String exData1 = f.getExcelFile("Emp", 4, 3, "./data/EmpDetail.xlsx");
		System.out.println(exData1);
		int j=5;
		for (int i=0;i<length;i++) {
			f.setExcelData("Emp", j, 2,ls.get(i) );
			j++;
		}

	}
}
