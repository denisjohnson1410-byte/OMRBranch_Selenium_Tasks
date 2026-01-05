package com.debugDay6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0601 {
	public void T0601() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement clkSignUp = driver.findElement(By.xpath("//a[@class='signupanchor showSignup']"));
		clkSignUp.click();
		Thread.sleep(5000);
		WebElement txtFirstName = driver.findElement(By.name("first_name"));
		txtFirstName.sendKeys("GreensTech");
		WebElement txtLastName = driver.findElement(By.name("last_name"));
		txtLastName.sendKeys("OMRBranch");
		WebElement txtPhone = driver.findElement(By.name("mobile_number"));
		txtPhone.sendKeys("9944152058");
		WebElement txtEmail = driver.findElement(By.name("signup_email"));
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
		WebElement txtPassword = driver.findElement(By.name("signup_password"));
		txtPassword.sendKeys("Greens@123");
		WebElement txtConfirmPassword = driver.findElement(By.name("confirm_password"));
		txtConfirmPassword.sendKeys("Greens@123");
		WebElement txtDay = driver.findElement(By.name("day"));
		txtDay.sendKeys("14");
		WebElement txtMonth = driver.findElement(By.name("month"));
		txtMonth.sendKeys("October");
		WebElement txtYear = driver.findElement(By.name("year"));
		txtYear.sendKeys("2001");
		WebElement clkDance = driver.findElement(By.id("dance"));
		clkDance.click();
		WebElement clkPhotography = driver.findElement(By.id("photography"));
		clkPhotography.click();
		WebElement clklearning = driver.findElement(By.id("learning"));
		clklearning.click();
		
		WebElement btnSignUp = driver.findElement(By.xpath("//button[text()='Sign up']"));
		btnSignUp.click();
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0601 T1 = new U0601();
		T1.T0601();
		
	}
	
	

}
