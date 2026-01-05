package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0306 {
	public void T0308() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement linkInterviewQs = driver.findElement(By.xpath("//div[@id='heading20']"));
		linkInterviewQs.click();
		
		Thread.sleep(1000);
		
		WebElement linkTCSQs = driver.findElement(By.xpath("//*[@id=\"collapse20\"]/div/div/ul/li[4]/a"));
		linkTCSQs.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		U0306 T6 = new U0306();
		T6.T0308();
		
	}

}
