package com.getDomPropertyDay5;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0502 {
	public void T0502() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		txtFirstName.sendKeys("GreensTech");
		WebElement txtLastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		txtLastName.sendKeys("OMR");
		WebElement txtPhone = driver.findElement(By.xpath("//input[@id='phone']"));
		txtPhone.sendKeys("9944152058");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		txtAddress.sendKeys("ICIC Bank Upstairs, Balamurugan Garden, Plot No.19, Landmark:, opposite to Sangeetha hotel Okkiam, Chennai, Tamil Nadu 600097");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtPassword.sendKeys("Greens@123");
		WebElement txtConfirmPassword = driver.findElement(By.xpath("//input[@id='confirm-password']"));
		txtConfirmPassword.sendKeys("Greens@123");
		
		@Nullable
		String enteredFirstName = txtFirstName.getDomProperty("value");
		String enteredLastName = txtLastName.getDomProperty("value");
		String enteredPhone = txtPhone.getDomProperty("value");
		String enteredEmail = txtEmail.getDomProperty("value");
		String enteredAddress = txtAddress.getDomProperty("value");
		String enteredPassword = txtPassword.getDomProperty("value");
		String enteredConfirmPassword = txtConfirmPassword.getDomProperty("value");
		
		System.out.println(enteredFirstName);
		System.out.println(enteredLastName);
		System.out.println(enteredPhone);
		System.out.println(enteredEmail);
		System.out.println(enteredAddress);
		System.out.println(enteredPassword);
		System.out.println(enteredConfirmPassword);
		
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0502 T2 = new U0502();
		T2.T0502();
		
	}

}
