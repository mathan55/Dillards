package org.sample;

import java.awt.Robot;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MscDirect {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-Anuth\\helloWatch\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
			
		driver.get("https://www.dillards.com/?facet=dil_shipinternational:Y");
		driver.manage().window().maximize();
		
		 WebElement cl = driver.findElement(By.id("closeButton"));
		cl.click();
		
		Thread.sleep(2000);
		
		
		WebElement cookies = driver.findElement(By.xpath("//button[@title='Accept Cookies']"));
		cookies.click();
		
		WebElement jew= driver.findElement(By.xpath("//a[@manual_cm_sp='Kids-_-header-_-nav']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(jew).perform();
		
		WebElement kp = driver.findElement(By.xpath("//a[text()='Pants']"));
		kp.click();
		
	    JavascriptExecutor j=(JavascriptExecutor)driver;
	    Thread.sleep(500);
	    WebElement jor = driver.findElement(By.xpath("//span[@data-part-number='20023903']"));
		j.executeScript("arguments[0].scrollIntoView(true)",jor);
		
		//TakeScreenshot method 
		
	    TakesScreenshot tk=(TakesScreenshot)driver;
		File temp=tk.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\Lenovo\\eclipse-Anuth\\helloWatch\\Screenshot\\ss01.png");
		FileUtils.copyFile(temp,desc);
		Thread.sleep(1000);
		
	    WebElement jor1 = driver.findElement(By.xpath("//span[@data-part-number='05906878']"));
	    jor1.click();
	    
		Thread.sleep(1000);

	    
	    
        WebElement si = driver.findElement(By.xpath("//li[@data-attrval=\"37587\"]"));
	    si.click();
	    
	    //robot class
	    
        WebElement pl = driver.findElement(By.xpath("//span[@class='stepperQtyPlus']"));
        pl.click();
       
        WebElement add = driver.findElement(By.xpath("//button[text()='Add To Bag']"));
        add.click();
        
//TakeScreenshot method 
    	
        TakesScreenshot tk1=(TakesScreenshot)driver;
    	File temp1=tk1.getScreenshotAs(OutputType.FILE);
    	File desc1=new File("C:\\Users\\Lenovo\\eclipse-Anuth\\helloWatch\\Screenshot\\ss02.png");
    	FileUtils.copyFile(temp1,desc1);
        
        //WebElement ch = driver.findElement(By.xpath("//a[@class='ATB__btn--checkoutBtn btn btn-block  btn-primary']"));
        //ch.click();
        
        driver.navigate().to("https://www.dillards.com/?facet=dil_shipinternational:Y");
        
        driver.quit();
        
      
		
	}

}
