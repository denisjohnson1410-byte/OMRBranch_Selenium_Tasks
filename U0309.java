package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0309 {
	public void T0311() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearchbar = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		txtSearchbar.sendKeys("Books");
		
		
		WebElement btnSearch= driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		btnSearch.click();
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0309 T9 = new U0309();
		T9.T0311();
		
	}
	

}
