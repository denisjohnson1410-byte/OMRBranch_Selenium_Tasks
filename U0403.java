package com.xpathAndgetTextDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0403 {
	public void T0403() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement heading = driver.findElement(By.xpath("//p[contains(text(),'We undertake')]"));
		String s = heading.getText();
		System.out.println(s);
		
		Thread.sleep(1500);
        
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0403 T3 = new U0403();
		T3.T0403();
		
	}
	

}
