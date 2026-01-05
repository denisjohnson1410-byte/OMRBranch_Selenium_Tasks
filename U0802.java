package com.actionClassAndRobotDay8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class U0802 {
	public void T0802() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement rightClick = driver.findElement(By.xpath("//button[contains (text(),'Right click')]"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
		
		Alert al = driver.switchTo().alert();
		al.sendKeys("13/03/2025");
		al.accept();
		
		WebElement pastDay = driver.findElement(By.xpath("//h6[contains(text(),'You entered')]"));
		if(pastDay.isDisplayed()) {
			System.out.println("Test Passed: Past day is displayed");
		}
		else {
			System.out.println("Test failed");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		U0802 T2 = new U0802();
		T2.T0802();
	}

}
