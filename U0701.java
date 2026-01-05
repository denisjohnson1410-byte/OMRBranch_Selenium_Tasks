package com.actionsClassDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class U0701 {
	public void T0701() throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		
		WebElement scr1 = driver.findElement(By.xpath("//a[text()=' String ']"));
		
		
		WebElement dest1 = driver.findElement(By.id("java-class"));
		
		WebElement scr2 = driver.findElement(By.xpath("//a[text()=' List '] "));
		
		WebElement dest2 = driver.findElement(By.id("java-interface"));
		
		WebElement scr3 = driver.findElement(By.xpath("//a[text()=' Actions ']"));
		
		WebElement dest3 = driver.findElement(By.id("selenium-class"));
		
		WebElement scr4 = driver.findElement(By.xpath("//a[text()=' Webdriver ']"));
		
		WebElement dest4 = driver.findElement(By.id("selenium-interface"));
			
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(scr1, dest1).perform();
		actions.dragAndDrop(scr2, dest2).perform();
		actions.dragAndDrop(scr3, dest3).perform();
		actions.dragAndDrop(scr4, dest4).perform();
		
		WebElement btnSuccess = driver.findElement(By.xpath("//a[text()='Succesfully Matched!']"));
		
		if(btnSuccess.isDisplayed()) {
			System.out.println("Drag and Drop actions were successful!");
		}
		else {
			System.out.println("Drag and Drop actions failed!");
		}
		
		Thread.sleep(1000);
		
		driver.quit();	
		
	}

	public static void main(String[] args) throws InterruptedException {
		U0701 T1 = new U0701();
		T1.T0701();
		
	}

}
