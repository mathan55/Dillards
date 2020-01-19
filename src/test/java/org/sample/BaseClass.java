package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	static WebDriver driver;
	
	public static void launchChromeDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-Anuth\\helloWatch\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();		
	}
public static void loadUrl(String u) {
	driver.get(u);
	}

public static void maximize() {
	
}

public static void getTitle() {
String title = driver.getTitle();
	System.out.println(title);
}
public static void getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
}
public void click(WebElement e) {
	e.click();
}
	public static void mouseOver(WebElement e) {
	Actions acc=new Actions(driver);
	acc.moveToElement(e).perform();
	
		}

}

