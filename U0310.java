package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0310 {
	public void T0312() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register");
		driver.manage().window().maximize();
		
		WebElement txtMobileNum = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtMobileNum.sendKeys("9080182521");
		
		
		WebElement btnOTPoption= driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnOTPoption.click();
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0310 T10 = new U0310();
		T10.T0312();
		
	}

}
