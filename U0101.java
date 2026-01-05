package com.browserLaunchDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0101 {
	public  void T0101() throws InterruptedException{

		// Set the system property for ChromeDriver (path to chromedriver executable)
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 // Create an instance of ChromeDriver (launch the Chrome browser)
		WebDriver driver = new ChromeDriver();
		// Navigate to the desired website 
		driver.get("https://www.omrbranch.com/");
		//print the page title
		System.out.println("Page Title: "+ driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}
	
	public void T0102() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://traininginomr.co.in/");
		
		System.out.println("Page Title: "+ driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	
	public void T0103() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://greenstech.in/");
		
		System.out.println("Page Title: "+ driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0101 day1 = new U0101();
		
		day1.T0101();
		day1.T0102();
		day1.T0103();
	}


}
