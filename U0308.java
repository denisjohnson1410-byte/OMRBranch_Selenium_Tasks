package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0308 {
	public void T0310() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement clkLogin = driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
		clkLogin.click();
		
		WebElement txtPhone = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		txtPhone.sendKeys("9442302349");
		
		WebElement btnOTP = driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		btnOTP.click();
		
		
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0308 T8 = new U0308();
		T8.T0310();
		
	}

}
