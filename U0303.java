package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0303 {
	public void T0305() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("iPhone");
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchButton.click();
		
		if(driver.getTitle().contains("iPhone")) {
			System.out.println("Search successful: 'iPhone' results is displayed.");
		}
		else {
			System.out.println("search failed: No results found.");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		U0303 T3 = new U0303();
		T3.T0305();
		
	}

}
