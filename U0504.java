package com.getDomPropertyDay5;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0504 {
	public void T0504() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement txtContactNumber = driver.findElement(By.xpath("//input[@id='inlineFormInputGroup']"));
		
		boolean isEnabled = txtContactNumber.getDomProperty("enabled")==null;
		
		if(isEnabled) {
			System.out.println("isEnabled:"+isEnabled);
			@Nullable		
			String contactNumber = txtContactNumber.getAttribute("value");
			System.out.println("Contact Number: "+contactNumber);
			
		}
		else {
			System.out.println("contact Number field is not enabled");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
		}
	
	public static void main(String[] args) throws InterruptedException {
		U0504 T4 = new U0504();
		T4.T0504();
		
	}

}
