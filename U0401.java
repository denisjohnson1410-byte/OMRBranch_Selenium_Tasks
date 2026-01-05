package com.xpathAndgetTextDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0401 {
	public void T0401() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		
		WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'For')]"));
		String s = heading.getText();
		System.out.println(s);
		
        WebElement name = driver.findElement(By.xpath("//span[contains(text(),'Velmurugan')]")); 
        String n = name.getText();
		System.out.println(n);
		
			Thread.sleep(1500);
        
			driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0401 T1 = new U0401();
		T1.T0401();		
		
	}


}
