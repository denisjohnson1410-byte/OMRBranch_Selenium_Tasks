package com.xpathAndgetTextDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0405 {
	public void T0405() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		
		WebElement btnOverview = driver.findElement(By.xpath("//a[@id='overview-tab']"));
		btnOverview.click();
		
		Thread.sleep(2000); 
	
		WebElement txtPara=driver.findElement(By.xpath("//p[contains(text(),'In this best')]"));
		String s = txtPara.getText();
		System.out.println(s);
		
		Thread.sleep(1500);
        
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0405 T5 =new U0405();
		T5.T0405();
		
	}

}
