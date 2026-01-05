package com.actionsClassDay7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class U0704 {
	public void T0704() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement mouseOverFashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(mouseOverFashion).perform();
		
		WebElement mouseOverKids = driver.findElement(By.xpath("//a[text()='Kids']"));
		
		actions.moveToElement(mouseOverKids).perform();
		
		mouseOverKids.click();
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     wait.until(ExpectedConditions.titleContains("Kids"));

	     String pageTitle = driver.getTitle();
	     System.out.println("Redirected Page Title: " + pageTitle);
	     
	     Thread.sleep(1000);
	     
	     driver.close();	
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0704 T4 = new U0704();
		T4.T0704();
		
	}

}
