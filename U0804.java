package com.actionClassAndRobotDay8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class U0804 {
	public void T0804() throws InterruptedException{
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		actions.moveToElement(signIn).perform();
		
		WebElement clkSignIn = driver.findElement(By.xpath("//span[text()='Sign in']"));
		clkSignIn.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration10);
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
		
		emailField.sendKeys("9944152058", Keys.ENTER);
		
		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")));
		
		passwordField.sendKeys("Greens@123", Keys.ENTER);
		
		if (driver.getCurrentUrl().contains("your-account")) {
			System.out.println("Login Successful!");
		}
		else {
			System.out.println("Login failed");
			
		}
		
		Thread.sleep(1000);
		
		driver.quit();
				
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0804 T4 = new U0804();
		
		T4.T0804();
	}

}
