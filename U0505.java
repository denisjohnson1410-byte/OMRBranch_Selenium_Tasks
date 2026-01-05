package com.getDomPropertyDay5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0505 {
	public void T0505() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement clkRememberMe = driver.findElement(By.xpath("//input[@name='remember_me']"));
		clkRememberMe.click();
		
		boolean isSelected = clkRememberMe.getDomProperty("checked")!=null;	
		
		if(isSelected) {
			System.out.println("CheckBox is Selected");
		}
		else {
			System.out.println("CheckBox is Not Selected");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
			
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0505 T5 = new U0505();
		T5.T0505();
		
	}

}
