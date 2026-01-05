package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0305 {

	public void T0307() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
 
		WebElement txtFrom = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		txtFrom.sendKeys("Mumbai");
		WebElement txtTo = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		txtTo.sendKeys("Chennai");
 
		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='sc-dAlyuH cIApyz']"));
		btnSearch.click();
		
		Thread.sleep(2000);
 
		driver.quit(); 
		}
	public static void main(String[] args) throws InterruptedException {
		U0305 T5 = new U0305();
		T5.T0307();
	}

}
