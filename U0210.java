package com.locatorAndSendkeysDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0210 {
	public void T0210() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("greenstechchennaiomr@gmail.com");
		
		Thread.sleep(1000);
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals("https://www.facebook.com/")) {
			System.out.println("Test Passed: Login action was Not triggered automatically.");
		}else {
			System.out.println("Test Failed: Page URL Changed, Login may have been triggered.");
		}
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {

		U0210 T10 = new U0210();
		T10.T0210();
		
	}

}
