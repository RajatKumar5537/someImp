package com.swarna.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver d=new FirefoxDriver();
		d.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_Y);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}
}
