package com.locatorAndSendkeysDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0204 {
	public void T0204() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement txtUsername = driver.findElement(By.name("username"));
		txtUsername.sendKeys("velmuragansirgtomr");
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("Greens@123");
		
		Thread.sleep(1000);
		
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.equals("https://www.instagram.com/")) {
			System.out.println("Test Passed: Login action was Not triggered automatically.");
		}else {
			System.out.println("Test Failed: Page URL Changed, Login may have been triggered.");
		}
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0204 T4 = new U0204();
		T4.T0204();
		
	}
	
}
