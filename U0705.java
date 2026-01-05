package com.actionsClassDay7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class U0705 {
	public void T0705() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement mouseOverHomeAndKitchen = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(mouseOverHomeAndKitchen).perform();
		
		WebElement mouseOverAllHomeDecor = driver.findElement(By.xpath("//p[text()='All Home Decor']"));
		actions.moveToElement(mouseOverAllHomeDecor).perform();
		mouseOverAllHomeDecor.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Home Decor"));
		
	     String pageTitle = driver.getTitle();
	     System.out.println("Redirected Page Title: " + pageTitle);	
		
	     Thread.sleep(1000);
	     
	     driver.quit();
	}
	
public static void main(String[] args) throws InterruptedException {
		
		U0705 T5 = new U0705();
		T5.T0705();
		
	}

}
