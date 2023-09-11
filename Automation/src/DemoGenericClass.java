import java.io.IOException;

import com.rajat.generic.FileLib;

public class DemoGenericClass {
public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
	String url = f.getPropertyFile("url");
	String un = f.getPropertyFile("username");
	String pwd = f.getPropertyFile("username");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	
	String ex = f.getExcelFile("CreateCustomer",2,4,"./data/CreateCustomer.xlsx");
	System.out.println(ex);
	String ex1 = f.getExcelFile("CreateCustomer",2,3,"./data/CreateCustomer.xlsx");
	System.out.println(ex1);
	
	f.setExcelData("CreateCustomer", 2, 3, "Susil");
}
}
