package com.locatorAndSendkeysDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0206 {
	public void T0206() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearchfield = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		txtSearchfield.sendKeys("Greens Tech Chennai Omr");
		
		Thread.sleep(1000);
		
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.contains("https://www.google.com/")) {
			System.out.println("Test Passed: Search action was Not triggered automatically.");
		}else {
			System.out.println("Test Failed: Page URL Changed, Search may have been triggered.");
		}
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0206 T6 = new U0206();
		T6.T0206();
		
	}

}
