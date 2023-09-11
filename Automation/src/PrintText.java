import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.com");
}
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();	
	d.get("https://www.actitime.com/");
	String text = d.findElement(By.id("toPasswordRecoveryPageLink")).getText();
	System.out.println(text);
	d.close();
	}

}
