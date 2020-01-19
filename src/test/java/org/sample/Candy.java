package org.sample;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Candy {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-Anuth\\helloWatch\\Driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
		
	driver.get("https://www.candy.com/");
	driver.manage().window().maximize();
	
	//SCROLL UP & down
	
    JavascriptExecutor j=(JavascriptExecutor)driver;
    
    Thread.sleep(500);
    
    WebElement cc = driver.findElement(By.xpath("//a[text()='Corporate Candy']"));
    
	j.executeScript("arguments[0].scrollIntoView(true)",cc);
	
	WebElement cc1 = driver.findElement(By.xpath("//a[text()='Corporate Candy']"));
	cc1.click();
	
	//TakeScreenshot method 
	
    TakesScreenshot tk=(TakesScreenshot)driver;
	File temp=tk.getScreenshotAs(OutputType.FILE);
	File desc=new File("C:\\Users\\Lenovo\\eclipse-Anuth\\helloWatch\\Screenshot\\praveen1.png");
	FileUtils.copyFile(temp,desc);
	
	WebElement search = driver.findElement(By.id("search"));
	search.sendKeys("cotton candy");
	
	WebElement sum = driver.findElement(By.xpath("//button[@type='submit']"));
	sum.click();
	
	WebElement search1 = driver.findElement(By.xpath("//a[text()='Cotton Candy Taffy, 1 lb']"));
	search1.click();
	
	WebElement cart = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
	cart.click();
	
	WebElement check = driver.findElement(By.id("proceed-to-checkout"));
	check.click();
	
	
	
	
	
	
	
	
	
	
    

	
	
	
}
}


