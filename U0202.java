package com.locatorAndSendkeysDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0202 {
	public void T0202() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		//Locate from fields
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys("GreensTech");
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys("OMR");
		WebElement txtMobileNumber = driver.findElement(By.id("phone"));
		txtMobileNumber.sendKeys("9944152058");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		txtAddress.sendKeys("ICIC Bank Upstairs, Balamurgan, Plot No.19, Landmark: opposite to sangeetha hotel, okkim, chennai, Tamil Nadu 60097");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Greens@123");
		WebElement txtConfirmPassword = driver.findElement(By.id("confirm-password"));
		txtConfirmPassword.sendKeys("Greens@123");
		
		Thread.sleep(1000);
		//Verification
		
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals("https://www.omrbranch.com/apitestingtraininginchennaiomr")) {
			System.out.println("Test Passed: Form fields entered successfully.");
			} else {
				System.out.println("Test Failed: Text entry issue in form fields.");
				}
		 driver.quit();
		}
	
	public static void main(String[] args) throws InterruptedException {
		U0202 T2 = new U0202();
		T2.T0202();
		
	}

}
