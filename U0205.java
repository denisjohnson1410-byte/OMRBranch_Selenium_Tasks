package com.locatorAndSendkeysDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0205 {
	public void T0205() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		driver.switchTo().frame("login_page");
		
		WebElement txtcustomerID = driver.findElement(By.name("fldLoginUserId"));
		txtcustomerID.sendKeys("greensomrbranch");
		
		Thread.sleep(1000);
		
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.contains("netbanking.hdfcbank.com")) {
			System.out.println("Test Passed: Login action was Not triggered automatically.");
		}else {
			System.out.println("Test Failed: Page URL Changed, Login may have been triggered.");
		}
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0205 T5 = new U0205();
		T5.T0205();
		
	}

}
