package com.locatorAndSendkeysDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0201 {
	public void T0201() throws InterruptedException {
		//Set up the WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
				
		//Locate the username and password fields
		WebElement txtEmail = driver.findElement(By.name("email"));
		//Enter credentials using sendKeys
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
				
		WebElement txtPassword = driver.findElement(By.name("pass"));
		//Enter credentials using sendKeys
		txtPassword.sendKeys("Greens@123");
				
		Thread.sleep(1500);
				
		//Validate that login is NOT triggered automatically
		String currentUrl=driver.getCurrentUrl();
				
		if(currentUrl.equals("https://www.omrbranch.com/"))
		{
			System.out.println("Test Passed: Credential entered successfully.");
		}
		else {
			System.out.println("Test Failed: Text entry issue.");
		}
		driver.quit();
		}

	public static void main(String[] args) throws InterruptedException {
		U0201 T1 = new U0201();
		T1.T0201();
		
	}
}
