package Rajat;

import org.openqa.selenium.chrome.ChromeDriver;

public class printTitle {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.google.com/");
	String Title = d.getTitle();
	System.out.println(Title);
	d.close();
}
}
