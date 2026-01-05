package com.locatorAndSendkeysDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0207 {
	public void T0207() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearchfield = driver.findElement(By.xpath("//input[@id='search-chatInput']"));
		txtSearchfield.sendKeys("Education Loan");
		
		Thread.sleep(1000);
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals("https://www.icicibank.com/")) {
			System.out.println("Test Passed: Search action was Not triggered automatically.");
		}else {
			System.out.println("Test Failed: Page URL Changed, Search may have been triggered.");
		}
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0207 T7 = new U0207();
		T7.T0207();
		
	}

}
