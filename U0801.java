package com.actionClassAndRobotDay8;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class U0801 {
	public void T0801() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement btnDouble = driver.findElement(By.xpath("//button[contains (text(),'Double')]"));
		Actions actions = new Actions(driver);
		actions.doubleClick(btnDouble).perform();
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		WebElement futureDate = driver.findElement(By.xpath("//h6[contains(text(),'Future date')]"));
		if(futureDate.isDisplayed()) {
			System.out.println("Test Passed: Future Date is displayed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0801 T1 = new U0801();
		T1.T0801();
	}

}
