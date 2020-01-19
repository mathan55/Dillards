package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class New  {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-Anuth\\helloWatch\\Driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
		
	driver.get("https://www.versace.com/international/en/home/");
	driver.manage().window().maximize();
	
	WebElement cook = driver.findElement(By.xpath("(//a[contains(text(),'Men')])[1]"));
	cook.click();
	Thread.sleep(8000);
	
	
		
		
		
		
	}

	
	}


