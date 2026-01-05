package com.xpathAndgetTextDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0402 {
	public void T0402() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement heading = driver.findElement(By.xpath("//h2[contains(text(),'Register')]"));
		String s = heading.getText();
		System.out.println(s);
		
		Thread.sleep(1500);
        
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		U0402 T2 = new U0402();
		T2.T0402();
		
	}
	

}
