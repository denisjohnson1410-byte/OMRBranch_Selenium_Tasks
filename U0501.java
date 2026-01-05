package com.getDomPropertyDay5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0501 {
	public void T0501() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='pass']"));
		
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
		txtPassword.sendKeys("Greens@123");
		
		String enteredEmail = txtEmail.getAttribute("value");
		String enteredPassword = txtPassword.getAttribute("value");		
		
		System.out.println("Entered UserName: "+enteredEmail);
		System.out.println("Entered Password: "+enteredPassword);
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0501 T1 = new U0501();
		T1.T0501();
		
	}

}
