package com.xpathAndgetTextDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0404 {
	public void T0404() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();
		
	
		WebElement headling=driver.findElement(By.xpath("//h4[contains(text(),'Section 1')]"));
		String s = headling.getText();
		System.out.println(s);
		
		Thread.sleep(1500);
        
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0404 T4 =new U0404();
		T4.T0404();
		
	}

}
