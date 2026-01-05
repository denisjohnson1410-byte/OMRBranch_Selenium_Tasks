package com.waitDay16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day16_Tasks {
	public void T1601() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		   // Open the website
        driver.get("https://www.omrbranch.com/");
        driver.manage().window().maximize();
        
        WebElement clkSignUp = driver.findElement(By.xpath("//a[@class='signupanchor showSignup']"));
		clkSignUp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(2));
		WebElement txtFirstName = w.until(ExpectedConditions.visibilityOfElementLocated(By.name("first_name")));
		txtFirstName.sendKeys("GreensTech");
		WebElement txtLastName = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='last_name']")));
		txtLastName.sendKeys("OMR");
		WebElement txtPhone = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='phone']")));
		txtPhone.sendKeys("9944152058");

		WebElement txtEmail = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");

		WebElement txtPassword = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		txtPassword.sendKeys("Greens@123");
		WebElement txtConfirmPassword = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='confirm-password']")));
		txtConfirmPassword.sendKeys("Greens@123");
		
		//Thread.sleep(1000);
		
		driver.quit();	
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Day16_Tasks day16 = new Day16_Tasks();
		
		day16.T1601();
	}
    
}
