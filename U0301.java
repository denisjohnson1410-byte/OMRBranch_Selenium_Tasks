package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0301 {
	
	public void T0301() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.omrbranch.com/");
			driver.manage().window().maximize();
			
			WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
			txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
			
			WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
			txtPassword.sendKeys("Greens@123");
			
			WebElement chkRememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));
			
				chkRememberMe.click(); //First click assume its checked by default it is clicked

				chkRememberMe.click(); //click again to unchecked the remember me checked box it is used for remain unchecked
			
			WebElement btnLogin = driver.findElement(By.xpath("//button[@value='login']"));
			btnLogin.click();
			
			Thread.sleep(2000);
			
			driver.quit();
		}
	
	public void T0302() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.omrbranch.com/");
			driver.manage().window().maximize();
			
			WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
			txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
			
			WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
			txtPassword.sendKeys("Greens@123");
			
			WebElement chkRememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));
			
				chkRememberMe.click(); //First click assume its checked 

			
			WebElement btnLogin = driver.findElement(By.xpath("//button[@value='login']"));
			btnLogin.click();
			
			Thread.sleep(2000);
			
			driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		
		U0301 T1 = new U0301();
		T1.T0301();
		T1.T0302();		
		
	}

}
