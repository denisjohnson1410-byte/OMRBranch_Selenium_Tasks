package com.xpathAndgetTextDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0406 {
	public void T0406() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
	
		WebElement headling=driver.findElement(By.xpath("//h1[contains(text(),'For Joining Automation Course')]"));
		String s = headling.getText();
		System.out.println(s);
		
		Thread.sleep(1500);
        
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0406 T6 = new U0406();
		T6.T0406();
		
	}

}
