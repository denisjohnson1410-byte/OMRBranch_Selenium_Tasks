package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0302 {
	public void T0303() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement rdoMale = driver.findElement(By.xpath("//input[@id='male']"));
		rdoMale.click();
		
		WebElement chkCricket = driver.findElement(By.xpath("//input[@id='checkbox-cricket']"));
		WebElement chkMovies = driver.findElement(By.xpath("//input[@id='checkbox-movie']"));
		WebElement chkHockey = driver.findElement(By.xpath("//input[@id='checkbox-hockey']"));
		
		chkCricket.click();
		chkMovies.click();
		chkHockey.click();
		
		System.out.println("Selected Male radio button and checked multiple Hobbies");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	public void T0304() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement rdoMale = driver.findElement(By.xpath("//input[@id='male']"));
		rdoMale.click();
		
		WebElement chkCricket = driver.findElement(By.xpath("//input[@id='checkbox-cricket']"));
		WebElement chkMovies = driver.findElement(By.xpath("//input[@id='checkbox-movie']"));
		WebElement chkHockey = driver.findElement(By.xpath("//input[@id='checkbox-hockey']"));
		
		chkCricket.click();
		chkMovies.click();
		chkHockey.click();
		
		Thread.sleep(1500);
		
		WebElement btnRefresh = driver.findElement(By.xpath("//button[@value='Refresh']"));
		btnRefresh.click();
		
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.equals("https://www.omrbranch.com/apitestingtraininginchennaiomr")){
			System.out.println("Page Refreshed successfully");
			}else {
				System.out.println("Page refresh failed");
			}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0302 T2 = new U0302();
		T2.T0303();
		T2.T0304();
		
	}

}
