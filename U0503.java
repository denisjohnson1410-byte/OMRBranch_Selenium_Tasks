package com.getDomPropertyDay5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class U0503 {
	public void T0503() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement rdoMale = driver.findElement(By.xpath("//input[@id='male']"));
		rdoMale.click();
		
		WebElement chkHobbies = driver.findElement(By.xpath("//input[@id='checkbox-cricket']"));
		WebElement chkMovies = driver.findElement(By.xpath("//input[@id='checkbox-movie']"));
		WebElement chkHockey = driver.findElement(By.xpath("//input[@id='checkbox-hockey']"));
		
		chkHobbies.click();
		chkMovies.click();
		chkHockey.click();
		
		boolean enabledMale = rdoMale.isEnabled();
		boolean enabledHobbies = chkHobbies.isEnabled();
		boolean enabledMovies = chkMovies.isSelected();
		boolean enabledHockey = chkHockey.isDisplayed();
		
		System.out.println("Radio Male Button - isEnabled: "+enabledMale);
		
		System.out.println("Radio Cricket Button - isEnabled: "+enabledHobbies);
		System.out.println("Radio Movies Button - isSelected:"+enabledMovies);
		System.out.println("Radio Hockey Button - isDisplayed:"+enabledHockey);

		Thread.sleep(1000);
		
		driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		U0503 T3 = new U0503();
		T3.T0503();
		
	}

}
