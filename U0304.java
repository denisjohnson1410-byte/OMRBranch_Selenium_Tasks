package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0304 {
	public void T0306() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys("velmurgansiromrbranch@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPassword.sendKeys("Greens@123");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		if(driver.getTitle().contains("login")) {
			System.out.println("Search successful: 'facebook' results is displayed.");
		}
		else {
			System.out.println("Search failed: No results found.");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		U0304 T4 = new U0304();
		T4.T0306();
		}
	

}
