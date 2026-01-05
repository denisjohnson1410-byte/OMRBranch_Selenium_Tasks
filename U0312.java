package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0312 {
	public void T0314() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		txtSearch.sendKeys("Greens tech chennai OMR Branch address");
		
		WebElement searchButton = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		searchButton.click();
		
		//Thread.sleep(2000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0312 T12 = new U0312();
		T12.T0314();
		
	}

}
