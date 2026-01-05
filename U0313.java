package com.xpathAndClickDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0313 {
	public void T0315() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		WebElement locateSignIn = driver.findElement(By.xpath("//a[@class='yt-spec-button-shape-next yt-spec-button-shape-next--outline yt-spec-button-shape-next--overlay yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-leading']"));
		locateSignIn.click();
		
		
		WebElement txtEmail= driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");
		
		WebElement nextButton = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		nextButton.click();
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0313 T13 = new U0313();
		T13.T0315();
		
	}

}
