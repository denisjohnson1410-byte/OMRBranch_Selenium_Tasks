package com.actionClassAndRobotDay8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0805 {
	public void T0805() {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Greens OMR Branch", Keys.ENTER);
		
		
	}

}
