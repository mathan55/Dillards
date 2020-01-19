package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainClass  {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-Anuth\\helloWatch\\Driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
		
	driver.get("https://hello-watches.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(8000);
	
	WebElement cook = driver.findElement(By.xpath("//*[@id=\"u_0_0\"]/div/div/span/div/div[1]/div[1]/div"));
	cook.click();
	Thread.sleep(8000);
	
	WebElement mes = driver.findElement(By.xpath("//svg[@height='10px']"));
	
	Thread.sleep(2000);
	mes.click();
	
		
		
		
		
		
		
		
		
	}

	
	}


