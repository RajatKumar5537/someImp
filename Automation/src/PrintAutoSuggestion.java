import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> allSug = d.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allSug.size();
		for (int i=0; i<count ; i++) {
			String text = allSug.get(i).getText();
			System.out.println(text);
		}
		allSug.get(1).click();
		Thread.sleep(1000);
		d.close();
	}
}
