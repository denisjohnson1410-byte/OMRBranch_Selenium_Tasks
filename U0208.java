package com.locatorAndSendkeysDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0208 {
	public void T0208() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("Bangalore");
		
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("Chennai");
		Thread.sleep(1000);
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals("https://www.redbus.in/")) {
			System.out.println("Test Passed: Search action was Not triggered automatically.");
		}else {
			System.out.println("Test Failed: Page URL Changed, Search may have been triggered.");
		}
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0208 T8 = new U0208();
		T8.T0208();
		
	}

}
